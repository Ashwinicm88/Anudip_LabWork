package Lab4;
/*Question: Create a class Student having roll_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result */

//Start of the Program
//importing scanner class for taking the input from user
import java.util.Scanner;

//created the Marks class with 5 subjects marks using array and extended the Student class
class Marks extends Student {
    private int marks[]=new int[5];// created array for 5 subjcet marks
    //created scanner class object
    Scanner sc=new Scanner(System.in);

    public Marks(int rollNo,String Name)//created the constructor of the class 
    {
        super(rollNo,Name);//called the base class constructor using super keyword
    }
    public void studentMarks(){
        System.out.println("Enter a marks for 5 Subject: ");
        for(int i=0;i<marks.length;i++){
            System.out.println("Subject"+(i+1)+" Marks: ");
            //taking the input of 5 subject marks
            marks[i]=sc.nextInt();     
        }
        sc.close();//closing the object of the Scanner class.
    }
    public void displayDetails(){
        //calling the base class method to display the student name and roll.no
        getDetails();
        //displaying the student 5 subjcets of marks
        for(int i=0;i<marks.length;i++){
            System.out.println("Subject"+(i+1)+" Marks: "+marks[i]);
        }
    }//end of the displayDetails()

}
public class MarksDetails // Created a Marksdetails Class with roll-no and name
{
    public static void main(String[] args) {
    //Created the Scanner object to take input from the user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student Roll.No and Name: ");
    //Taking the input from the user
    int rollNo=sc.nextInt();
    sc.nextLine();
    String studentName=sc.nextLine();

    //created the object of the Mraks class which have student details and marksdetails, passing values using parameterized constructor
    Marks obj= new Marks(rollNo,studentName);

    //calling the StudentMarks and displaying the details
    obj.studentMarks();
    obj.displayDetails();
    sc.close();//closing the object of the Scanner class.
    }
}
// End of the Program