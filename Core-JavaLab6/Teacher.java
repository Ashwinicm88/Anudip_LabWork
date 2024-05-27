package Lab5;

//start of the Teacher class
//created class called Teacher and implemented the Person interface to access the speak method.
public class Teacher implements Person {
    @Override
    public void speak() //called the speak method from interface and writter body
    {
        System.out.println("Teacher: Good Morning Student..!!");//prints the statement
    }
}
//end of the Teacher class.