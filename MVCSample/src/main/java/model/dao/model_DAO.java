package model.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.bean.*;

public class model_DAO {
	public static ArrayList<data> getAllData(){
		ArrayList<data> result = new ArrayList<data>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
			Statement sm = (Statement) con.createStatement();
			String sql = "SELECT * FROM job_details";
			ResultSet  rs = sm.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("Title");
				String company = rs.getString("Company");
				String salary = rs.getString("Salary");
				data dt = new data(id, title, company, salary);
				result.add(dt);
			}
		}
		catch(Exception e){
			
		}
		return result;
	}
	
	public static ArrayList<allData> getAlldata(){
		ArrayList<allData> result = new ArrayList<allData>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
			Statement sm = (Statement) con.createStatement();
			String sql = "SELECT * FROM job_details";
			ResultSet  rs = sm.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("Title");
				String company = rs.getString("Company");
				String posting_date = rs.getString("Posting_date");
				String deadline = rs.getString("Deadline");
				String salary = rs.getString("Salary");
				String yoe = rs.getString("Yoe");
				String tpye = rs.getString("Type");
				String level = rs.getString("Level");
				String education = rs.getString("Education");
				String sex = rs.getString("Sex");
				String career = rs.getString("Career");
				String age = rs.getString("Age");
				String id_job = rs.getString("Id_job");
				String contact_with = rs.getString("Contact_with");
				String location = rs.getString("Location");
				String note = rs.getString("Note");
				String phone_number = rs.getString("Phone_number");
				String language = rs.getString("Language");
				String describe_job = rs.getString("Describe_job");
				String benefits = rs.getString("Benefits");
				String skills = rs.getString("Skills");
				allData dt = new allData( id, title, posting_date, deadline, company, salary, yoe, tpye, level, education, sex, career, age, id_job, contact_with, location, note, phone_number, language,describe_job,benefits,skills);
				result.add(dt);
			}
		}
		catch(Exception e){
			
		}
		return result;
	}
	
	public static ArrayList<data> getDataLike(String txt){
		ArrayList<data> result = new ArrayList<data>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT * FROM job_details WHERE Career LIKE '%?%'");
			statement.setString(1, txt);
			try (ResultSet rs = statement.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("Title");
					String company = rs.getString("Company");
					String salary = rs.getString("Salary");
					data dt = new data(id, title, company, salary);
					result.add(dt);
				}
			}
		}
		catch(Exception e){
			
		}
		return result;
	}
	
	public boolean isExistUser(String userName, String password ,String id) {
		boolean isValid = false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
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
	
	public boolean checkAccount(String username, String gmail) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
			Statement sm = (Statement) con.createStatement();
			String sql = "SELECT * FROM admin";
			ResultSet  rs = sm.executeQuery(sql);
			while(rs.next()){
				if((username.equals(rs.getString("username")) && gmail.equals(rs.getString("gmail")))){
					check = true; break;
				}		
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public static boolean InsertAccount(String id, String username, String password, String gmail) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/pbl4", "root", "");
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("INSERT INTO admin (id, username, password, gmail) VALUES (?, ?, ?, ?)");
			statement.setString(1, id);
			statement.setString(2, username);
		    statement.setString(3, password);
		    statement.setString(4, gmail);
		    statement.executeUpdate();
		    check = true;
		}
		catch(Exception e) 
		{ 
			System.out.println("Lỗi: " + e.getMessage()); 
		}
		return check;
	}
}
