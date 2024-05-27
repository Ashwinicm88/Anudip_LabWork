package Lab7;
/*WAP to search given student name is available in the list of student name using String array. */

//start of program
import java.util.Scanner;
public class StudentSearch {
    
    public static boolean search(String[] studentNames,String searchName)
    {
        for(String name:studentNames)//here we iterated the array to the name
        {
            if(name.equalsIgnoreCase(searchName))//it checks the to string whether it equals or not and it's ignores the upper and lower case.
            {
                return true;
            }
        }
        return false;
    } 
public static void main(String[] args) 
 {
    String[] studentNames={"Ashwini","Rani","Gauri","Tejas","Ushashri","Abhishek"};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student name to search: ");
    //taking the input from user
    String searchName=sc.nextLine();  
    boolean found=search(studentNames,searchName);//passing the array and search element

    if((found))//if it gets true value then if block executes
    {
        System.out.println("Yes, "+searchName+" is available in the Student List.");
    }
    else// otherwise else block will execute
    {
        System.out.println("No, "+searchName+" is available in the Student List.");
    }
 }    
}
//end of the Program