package Lab6;

class Employee1 extends Person // extended the abstract class Person
{
    String designation;

    // created a parameterized Constructor
    Employee1(int id, String name, double salary, String designation) 
    {
        super(id, name, salary);//used the super keyword to call the parent class constructor
        this.designation = designation;
    }

    @Override
    void displayInfo() //displaying information of Employee
    {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
    }
}

