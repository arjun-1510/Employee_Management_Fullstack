package edu.jsp.Employee_App.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DAO.EmployeeDAO;
import edu.jsp.Employee_App.DTO.Employee;

@WebServlet("/get")
public class getInServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		int id = Integer.parseInt(req.getParameter("eid"));
		
		
	Employee e 	= new EmployeeDAO().getEmployeeById(id);
	
	req.setAttribute("employee", e);
	
	
	req.getRequestDispatcher("update.jsp").forward(req, resp);
	
	
		
		
	}
	
	
	
	

}
