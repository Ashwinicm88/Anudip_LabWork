package Lab6;
public class Main {
    public static void main(String[] args) {
        // Creating objects of Manager and Employee classes
        Manager manager = new Manager(1, "Aishwarya Annam", 80000,"Finance");
        Employee1 employee = new Employee1(2, "Nikita Gurram", 60000, "Software Engineer");

        // Displaying manager and employee information
        System.out.println("Manager Information:");
        manager.displayInfo();
        System.out.println("\nEmployee Information:");
        employee.displayInfo();
    }
}



