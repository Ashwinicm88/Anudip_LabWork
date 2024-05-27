package Lab4;
/*Question: Create a class Student having roll_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result */
//Student class with rollNo and Name
public class Student {
    private int rollNo;
    private String studentName;

    public Student(int rollNo,String Name)//Constructor of Student class
    {
        //initiating varibles using this keyword
        this.rollNo=rollNo;
        this.studentName=Name;
    }
    public void getDetails(){
        //Displaying the Students Infromation
        System.out.println("***Student Details***");
        System.out.println("Student Roll.No: "+rollNo);
        System.out.println("Student Name: "+studentName);
    }
}
// End of the Program