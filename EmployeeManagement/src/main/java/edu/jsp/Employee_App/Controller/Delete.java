package edu.jsp.Employee_App.Controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.Employee_App.DTO.Employee;
@WebServlet("/delete")
public class Delete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  //int id = Integer.parseInt((req.getParameter("delete"))) ;
		  
		  
		  
		  
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		  EntityManager em = emf.createEntityManager();
		  EntityTransaction et = em.getTransaction();
		  
		  
		//Employee s= (Employee)  req.getAttribute("id");
		
	int d = Integer.parseInt((req.getParameter("mobile")));
		
		
		  
		Employee e =  em.find(Employee.class, d);
		
		
		et.begin();
		em.remove(e);
		et.commit();
		System.out.println("data deleted");
		
		resp.getWriter().print("<h1>Deleted</h1>");
		
	}
	
	
	
	

}
