package model.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.bean.*;

public class M_DAO {
	public boolean isExistUser(String userName, String password ,String id) {
		boolean isValid = false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
				Statement sm = (Statement) con.createStatement();
				String sql = "SELECT * FROM admin";
				ResultSet  rs = sm.executeQuery(sql);
				while(rs.next()){
					if((userName.equals(rs.getString("username")) && password.equals(rs.getString("password")) && id.equals(rs.getString("id")))){
						isValid = true; break;
					}		
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return isValid;
	}
	
	public boolean checkID(String id) {
		boolean isValid = false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
				Statement sm = (Statement) con.createStatement();
				String sql = "SELECT * FROM admin";
				ResultSet  rs = sm.executeQuery(sql);
				while(rs.next()){
					if(id.equals(rs.getString("id"))){
						isValid = true; break;
					}		
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return isValid;
	}
	
	public static ArrayList<InforSV> getAllInfor(){
		ArrayList<InforSV> result = new ArrayList<InforSV>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			Statement sm = (Statement) con.createStatement();
			String sql = "SELECT * FROM thongtinnhom";
			ResultSet  rs = sm.executeQuery(sql);

			while(rs.next()) {
				String masv = rs.getString("masv");
				String hoten = rs.getString("hoten");
				String congviec = rs.getString("congviec");
				String diachi = rs.getString("diachi");
				String sdt = rs.getString("sdt");
				String email = rs.getString("email");
				InforSV in = new InforSV(masv, hoten, congviec, diachi, sdt, email);
				result.add(in);
			}
		}
		catch(Exception e){
		
		}
		return result;
	}
	
	public static boolean InsertSV(String MaSV, String HoTen, String CongViec, String DiaChi, String SDT, String Email) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("INSERT INTO thongtinnhom (masv, hoten, congviec, diachi, sdt, email) VALUES (?, ?, ?, ?, ?, ?)");
			statement.setString(1, MaSV);
			statement.setString(2, HoTen);
		    statement.setString(3, CongViec);
		    statement.setString(4, DiaChi);
		    statement.setString(5, SDT);
		    statement.setString(6, Email);
		    statement.executeUpdate();
			check = true;
		}
		catch(Exception e){
			
		}
		return check;
	}
	
	public static InforSV selectSV(String masv) {
		InforSV in = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("select hoten, congviec, diachi, sdt, email from thongtinnhom where masv = ?");
			statement.setString(1, masv);
			try (ResultSet rs = statement.executeQuery()){
				if(rs.next()) {
					String hoten = rs.getString("hoten");
					String congviec = rs.getString("congviec");
					String diachi = rs.getString("diachi");
					String sdt = rs.getString("sdt");
					String email = rs.getString("email");
					in = new InforSV(masv, hoten, congviec, diachi, sdt, email);
				}
			}
		}catch (Exception e) {
	        e.printStackTrace();
	    }
		
		return in;
	}
	public static boolean UpdateSV(String MaSV, String HoTen, String CongViec, String DiaChi, String SDT, String Email) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("UPDATE thongtinnhom SET hoten = ?, congviec = ?, diachi = ?, sdt = ?, email = ? WHERE masv = ?");
			statement.setString(1, HoTen);
		    statement.setString(2, CongViec);
		    statement.setString(3, DiaChi);
		    statement.setString(4, SDT);
		    statement.setString(5, Email);
		    statement.setString(6, MaSV);
		    statement.executeUpdate();
			check = true;
		}
		catch(Exception e){
			
		}
		return check;
	}
	public static boolean deleteSV(String masv) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("DELETE from thongtinnhom WHERE masv = ?");
			statement.setString(1, masv);
			statement.executeUpdate();
			check = true;
		}
		catch(Exception e){
			
		}
		return check;
	}
	
	public static ArrayList<InforSV> searchSV(String txt) {
		ArrayList<InforSV> result = new ArrayList<InforSV>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("select * from thongtinnhom where masv = ? OR hoten = ? OR congviec = ? OR diachi = ? OR sdt = ? OR email = ?");
			statement.setString(1, txt);
			statement.setString(2, txt);
			statement.setString(3, txt);
			statement.setString(4, txt);
			statement.setString(5, txt);
			statement.setString(6, txt);
			try (ResultSet rs = statement.executeQuery()){
				while(rs.next()) {
					String masv = rs.getString("masv");
					String hoten = rs.getString("hoten");
					String congviec = rs.getString("congviec");
					String diachi = rs.getString("diachi");
					String sdt = rs.getString("sdt");
					String email = rs.getString("email");
					InforSV in = new InforSV(masv, hoten, congviec, diachi, sdt, email);
					result.add(in);
				}
			}
		}catch (Exception e) {
	        e.printStackTrace();
	    }
		
		return result;
	}
	
	public static boolean deleteAll() {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/dulieu", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("TRUNCATE TABLE thongtinnhom;");
			statement.executeUpdate();
			check = true;
		}
		catch(Exception e){
			
		}
		return check;
	}
}
