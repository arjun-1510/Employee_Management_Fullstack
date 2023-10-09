package edu.jsp.Employee_App.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServlet;

import edu.jsp.Employee_App.DTO.Employee;

public class EmployeeDAO  {
	
	
	
	
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	
	public void SaveEmployee(Employee employee ) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(employee);
		et.commit();
		System.out.println("data saved");
		
		
		
	}

	public Employee GetEmployee (String email) {
		
		try {
			EntityManager em = emf.createEntityManager();
			
			Query q = em.createQuery("select e from Employee e where e.email=?1");
			
			
			q.setParameter(1, email);
			
			    Employee e =   (Employee) q.getSingleResult();
			
			
			return e;
		}
		catch(Exception e ) {
			return null;
		}
	}
	
	
	public List<Employee> getAllEmployee() {
		
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e");
		
		return q.getResultList();
	}
	
	
	public Employee getEmployeeById(int id) {
		
		
		
		return emf.createEntityManager().find(Employee.class, id);
		
		
		
		
		
		
	}
	
	
	public String deleteById(int id) {
		
		
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		
		Employee employee = em.find(Employee.class, id);
		
		if(employee !=null) {
		et.begin();
		em.remove(employee);
		et.commit();
		
		return "Data Deleted";
		}else {
			return "Id Not Found";
		}
	}
	
	
	public void UpdateEmployee(Employee employee) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(employee);
		et.commit();
		System.out.println("update ");
		
		
		
		
	}
	
	
	
}
