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
import model.bo.model_BO;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		String destination = null;	

		if("login".equals(action)) {
			destination = "/login.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		else if("loginSuccess".equals(action)) {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			model_BO bo = new model_BO();
			if(bo.isValidUser(userName, password, "CLIENT")) {
				request.setAttribute("username", userName);
				ArrayList<allData> data = null;
				data = bo.getAlldata();
				request.setAttribute("data", data);
				destination = "/clientForm.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
			else {
				destination = "/login.jsp";
				request.setAttribute("message", "Tài khoản không chính xác. Vui lòng nhập lại!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		else if("register".equals(action)) {
			destination = "/register.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		
		else if("RegisterSuccess".equals(action)) {
			String gmail = request.getParameter("gmail");
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			model_BO bo = new model_BO();
			if(bo.checkAccount(userName, gmail) == false){
				if(bo.InsertAccount("CLIENT",userName, password, gmail)) {
					destination = "/login.jsp";
					RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
					rd.forward(request, response);
				}
			}
			else {
				destination = "/register.jsp";
				request.setAttribute("message", "Tài khoản hoặc gmail đã tồn tại. Vui lòng nhập lại!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		
		else if("logout".equals(action)) {
			destination = "/index.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
