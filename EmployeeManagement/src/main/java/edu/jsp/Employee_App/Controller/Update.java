package edu.jsp.Employee_App.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DAO.EmployeeDAO;
import edu.jsp.Employee_App.DTO.Employee;


@WebServlet("/update")
public class Update  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = 	req.getParameter("name");
		String cname = 	req.getParameter("cname");
		String job = 	req.getParameter("job");
		double salary = Double.parseDouble(req.getParameter("salary"))	;
		String email= 	req.getParameter("email");
		long phone = 	Long.parseLong(req.getParameter("phone"));
	   String password = 	req.getParameter("password");
	   
	   
	   
	   
	   Employee employee = new Employee();
	   
	   
	   employee.setId(id);
	   employee.setName(name);
	   employee.setCname(cname);
	   employee.setJob(job);
	   employee.setSalary(salary);
	   employee.setEmail(email);
	   employee.setPassword(password);
	   employee.setPhone_Number(phone);
	   
	   
	   
	  new  EmployeeDAO().UpdateEmployee(employee);
	  
	  resp.getWriter().print("<h1>updated</h1>");
	  
		
		
		
	}

	
	
	
}
