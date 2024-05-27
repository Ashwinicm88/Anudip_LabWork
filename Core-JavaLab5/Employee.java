package Lab6;
public class Employee {
    public static void main(String[] args) {
        // Creating objects of Employee class
        EmployeeInfo employee1 = new EmployeeInfo("Robert",1994, "64C- WallsStreet");
        EmployeeInfo employee2 = new EmployeeInfo("Sam", 2000, "68D- WallsStreet");
        EmployeeInfo employee3 = new EmployeeInfo("John", 1999, "26B- WallsStreet");

        // Displaying employee information
        System.out.println("Name\tYear of joining\t\tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
class EmployeeInfo 
{

    String name;
    int yearOfJoining;
    String address;

    // created parameterized Constructor
    EmployeeInfo(String name, int yearOfJoining, String address) 
    {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee information
    void displayInfo() 
    {
        System.out.printf("%-10s%-20d%-20s\n", name, yearOfJoining, address);
    }
}

