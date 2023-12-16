package model.bo;

import java.util.ArrayList;

import model.bean.InforSV;
import model.dao.*;
public class M_BO {
	M_DAO dao = new M_DAO();
	public boolean isValidUser(String userName, String password, String id) {
		return dao.isExistUser(userName, password, id);
	}
	
	public boolean checkid(String id) {
		return dao.checkID(id);
	}
	
	public ArrayList<InforSV> getAllInfor(){
		return dao.getAllInfor();
	}
	
	public boolean insertCon(String MaSV, String HoTen, String CongViec, String DiaChi, String SDT, String Email) {
		return dao.InsertSV(MaSV, HoTen, CongViec, DiaChi, SDT, Email);
	}
	
	public InforSV selectSV(String masv) {
		return dao.selectSV(masv);
	}
	
	public boolean updateCon(String MaSV, String HoTen, String CongViec, String DiaChi, String SDT, String Email) {
		return dao.UpdateSV(MaSV, HoTen, CongViec, DiaChi, SDT, Email);
	}
	
	public boolean deleteSV(String masv) {
		return dao.deleteSV(masv);
	}

	public ArrayList<InforSV> searchSV(String txt) {
		return dao.searchSV(txt);
	}
	
	public boolean deleteAll() {
		return dao.deleteAll();
	}
}
