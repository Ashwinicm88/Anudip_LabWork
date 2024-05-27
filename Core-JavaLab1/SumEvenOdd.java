package Lab1;
/*Write a program that reads a set of integers, and 
then prints the sum of the even and odd integers. */

import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    //Taking input from user for how many number they want to enter
    System.out.println("Enter a number of integers: ");
    int numInteger=sc.nextInt();
    int sumEven=0,sumOdd=0;
    //Iterating loop for set of integers
    for(int i=0;i<numInteger;i++)
    {
        int number=sc.nextInt();
        //Checking whether number is even then it will add into sumEven
        if(number%2==0)
        {
            sumEven+=number;
        }
        //Checking whether number is odd then it will add into sumOdd
        else if(number%2!=0)
        {
            sumOdd+=number;  
        }
    }
    System.out.println("Sum of Even number is: "+sumEven);
    System.out.println("Sum of odd number is: "+sumOdd);
   sc.close();
}
}
//End of Program