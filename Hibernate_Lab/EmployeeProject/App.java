package com.example.EmployeeAndProject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        try {
        	EmployeeDetails emp=new EmployeeDetails();
			emp.setEmpName("Gauri");
			emp.setEmpSalary(25000);
			
			EmployeeDetails emp1=new EmployeeDetails();
			emp1.setEmpName("Tejas");
			emp1.setEmpSalary(40000);
			
			EmployeeDetails emp2=new EmployeeDetails();
			emp2.setEmpName("Rani");
			emp2.setEmpSalary(30000);
			
			EmployeeDetails emp3=new EmployeeDetails();
			emp3.setEmpName("Sushma");
			emp3.setEmpSalary(40000);
			
			ProjectDetails project1=new ProjectDetails();
			project1.setProjectName("E-Commerce Website");
			
			ProjectDetails project2=new ProjectDetails();
			project2.setProjectName("Face Recognition System");
			
			emp1.setProject(project1);
			emp2.setProject(project2);
			emp3.setProject(project1);
			emp.setProject(project2);
			
			project1.getEmp().add(emp1);
			project1.getEmp().add(emp2);
			project2.getEmp().add(emp);
			project2.getEmp().add(emp3);
		     

			session.save(project1);
			session.save(project2);
			
			session.getTransaction().commit();
			
        }
        finally 
        {
        session.close();
        sessionFactory.close();
        	
        }
        
        
    }
}
