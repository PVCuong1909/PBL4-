package model.bo;

import java.util.ArrayList;

import model.bean.*;
import model.dao.*;

public class model_BO {
	model_DAO dao = new model_DAO();
	public ArrayList<data> getAllData(){
		return dao.getAllData();
	}
	
	public ArrayList<allData> getAlldata(){
		return dao.getAlldata();
	}
	
	public ArrayList<data> getDataLike(String txt){
		return dao.getDataLike(txt);
	}
	
	public boolean isValidUser(String userName, String password, String id) {
		return dao.isExistUser(userName, password, id);
	}
	
	public boolean checkAccount(String username, String gamil) {
		return dao.checkAccount(username, gamil);
	}
	
	public boolean InsertAccount(String id,String username, String password, String gmail) {
		return dao.InsertAccount(id, username, password, gmail);
	}
}
