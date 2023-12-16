package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.*;
import model.bo.*;

@WebServlet("/C_Servlet")
public class C_Servlet extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		String destination = null;
		String userName = request.getParameter("userName");
		request.setAttribute("username", userName);
		
		if("checklogin".equals(action)) {
			String password = request.getParameter("password");
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			
			if(bo.isValidUser(userName, password, "ADMIN")) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/main.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else if (bo.isValidUser(userName, password, "CLIENT")) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/clientForm.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			
			else {
				destination = "/login.jsp";
				request.setAttribute("message", "Tài khoản không tồn tại!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		
		else if("insert".equals(action)) {
			destination = "/insertForm.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		
		else if("insertSuccess".equals(action)) {
			String MaSV = request.getParameter("MaSV");
			String HoTen = request.getParameter("HoTen");
			String CongViec = request.getParameter("CongViec");
			String DiaChi = request.getParameter("DiaChi");
			String SDT = request.getParameter("SDT");
			String Email = request.getParameter("Email");
			
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			if (bo.insertCon(MaSV, HoTen, CongViec, DiaChi, SDT, Email)) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/main.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			} else {
				destination = "/insertForm.jsp";
				request.setAttribute("message", "Thêm thông tin không thành công!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		
		else if("update".equals(action)) {
			String Masv = request.getParameter("masv");
			M_BO bo = new M_BO();
			InforSV in = bo.selectSV(Masv);
			request.setAttribute("IN", in);
			destination = "/updateForm.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		
		else if("updateSuccess".equals(action)) {
			String MaSV = request.getParameter("MaSV");
			String HoTen = request.getParameter("HoTen");
			String CongViec = request.getParameter("CongViec");
			String DiaChi = request.getParameter("DiaChi");
			String SDT = request.getParameter("SDT");
			String Email = request.getParameter("Email");
			
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			if (bo.updateCon(MaSV, HoTen, CongViec, DiaChi, SDT, Email)) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/main.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else{
				destination = "/updateForm.jsp";
				request.setAttribute("message", "Cập nhật thông tin không thành công!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		
		else if("deleteAll".equals(action)) {
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			if(bo.deleteAll()) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/main.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		
		else if("search".equals(action)) {
			String txt = request.getParameter("txt");
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			inforArray = bo.searchSV(txt);
			request.setAttribute("inforArray", inforArray);
			destination = "/main.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		
		else if("select".equals(action)) {
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			inforArray = bo.getAllInfor();
			request.setAttribute("inforArray", inforArray);
			destination = "/main.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		
		else if("delete".equals(action)) {
			String Masvs = request.getParameter("masvs");
			M_BO bo = new M_BO();
			ArrayList<InforSV> inforArray = null;
			if(bo.deleteSV(Masvs)) {
				inforArray = bo.getAllInfor();
				request.setAttribute("inforArray", inforArray);
				destination = "/main.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
	}
}
