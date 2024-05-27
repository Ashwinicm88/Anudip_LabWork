package Lab5;
//start of the student class
//created class called student and implemented the Person interface to access the speak method.
public class Student implements Person 
{

    @Override
    public void speak() //called the speak method from interface and writter body
    {
        System.out.println("Student: I am a Student.");//prints the statement
    }
    
}
//end of the Student class.