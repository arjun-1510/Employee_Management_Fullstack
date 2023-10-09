package edu.jsp.Employee_App.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DAO.EmployeeDAO;
import edu.jsp.Employee_App.DTO.Employee;


@WebServlet("/login")
public class LogInServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee e = dao.GetEmployee(email);
		
		if(e != null) {
			
			
			if(password.equals(e.getPassword())) {
				
				
				req.getRequestDispatcher("getall").forward(req, resp);
			}
			else {
				resp.getWriter().print("<h1>Incoret Password</h1>");
				req.getRequestDispatcher("Login.jsp").include(req, resp);
			}
			
			
			
		}else {
			resp.getWriter().print("<h1>Incoret Email</h1>");
			req.getRequestDispatcher("Login.jsp").include(req, resp);
		}
		
		
	}
	
	
	
	

}
