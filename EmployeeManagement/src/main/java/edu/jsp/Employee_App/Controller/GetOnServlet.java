package edu.jsp.Employee_App.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DAO.EmployeeDAO;
import edu.jsp.Employee_App.DTO.Employee;


@WebServlet("/getall")
public class GetOnServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		
		
		List<Employee> employees = dao.getAllEmployee();
		
		
		req.setAttribute("list", employees);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("getAll.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	
	
	
	
	

}
