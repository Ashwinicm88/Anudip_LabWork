package Lab4;
/*Question: WAP using java bean for employee with(empId,ename,esalary) */
//start of the Program
//created EmployeeMain class 
public class EmployeeMain {
    public static void main(String[] args) {
        //Creating object of the Employee class
        Employee obj=new Employee();
        //calling methods by passing the arguments
        obj.setId(101);
        obj.setName("Ashwini");
        obj.setSalary(20000);

        //Displaying the employee details by calling the getter mathods using object of the class
        System.out.println("Employee Id: "+obj.getId());
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Salary: "+obj.getSalary());
    }
}
//end of the Program
