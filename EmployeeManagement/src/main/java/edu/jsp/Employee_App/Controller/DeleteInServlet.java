package edu.jsp.Employee_App.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DAO.EmployeeDAO;



@WebServlet("/deleteInServlet")
public class DeleteInServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int id = Integer.parseInt(req.getParameter("mobile"));
		
		
		EmployeeDAO dao = new EmployeeDAO();
		
		
		resp.getWriter().print("<h1>"+dao.deleteById(id)+"</h1>");
		
		
		
		
		
		
	}
	
	
	
	
	

}
