package Lab4;
/*Question: WAP using java bean for employee with(empId,ename,esalary) */
//start of the Program
//created class Employee using java bean getter and setter methods
public class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public int getId()//getId method which will return integer value
    {
        return empId;//returns the emp Id
    }
    public String getName()//getName method which will return String value
    {
        return empName;//returns the emp name
    }
    public double getSalary()//getSalary method which will return double value
    {
        return empSalary;//returns the emp salary
    }
    public void setId(int id)//setId method which will intializing value
    {
        this.empId=id;//initializing empid to id using this keyword
    }
    public void setName(String name)//setName method which will intializing value
    {
        this.empName=name;//initializing empName to name using this keyword
    }
    public void setSalary(double salary)//setSalary method which will intializing value
    {
        this.empSalary=salary;//initializing empSalary to salary using this keyword
    }
   
}
//end of the program