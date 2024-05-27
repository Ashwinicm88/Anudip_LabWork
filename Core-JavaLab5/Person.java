package Lab6;
/*WAP to implement abstract methods for class person(id,name,salary) and subclass manager and Employee .(add your own attributes of choice) */
//start of the Program
abstract class Person 
{
    int id;
    String name;
    double salary;

    Person(int id, String name, double salary)//created abstract class constructor
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    abstract void displayInfo();//created abstract method and abstract methods doesn't have implementation.
}