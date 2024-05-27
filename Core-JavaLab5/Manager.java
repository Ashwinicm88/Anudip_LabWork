package Lab6;

class Manager extends Person // extended the abstract class Person
{
    String department;

    Manager(int id, String name, double salary,String designation)
    {
        super(id, name, salary);//used the super keyword to call the parent class constructor
        this.department = department;
        
    }
    
    @Override
    void displayInfo() 
    {
        System.out.println("Manager ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);    
    }
    
}