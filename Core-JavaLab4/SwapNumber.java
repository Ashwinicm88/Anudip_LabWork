package Lab4;
/*Question: WAP to swap two numbers without using third variable using class and object concept. */

//Start of the Program
//Importing a scanner class for the input from the user
import java.util.Scanner;

public class SwapNumber extends SwappingClass// extending Swapping class
{
    public static void main(String[] args) {
        //Created the Scanner object to take input from the user
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a two numbers: ");
        //taking the input from the user
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        //created the object of the class
        SwapNumber obj=new SwapNumber();
        obj.swap(num1,num2);//called the swap method from Swapping Class with arguments
    sc.close();//closing the object of the Scanner class.
    }
}

// End of the Program