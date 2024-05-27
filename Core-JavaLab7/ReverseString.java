package Lab7;
//start of the Program
import java.util.Scanner;
/*WAP a program to reverse a given String without using reverse() method.*/
public class ReverseString {

    public static String reverse(String inputStr)
    {
        char[] inputStrCharArray= inputStr.toCharArray();//converted the string into character array
        int start=0;//initialized the starting index as 0
        int end=inputStr.length()-1;//initialised the length of the string

        while(start<end)
        {
           /*Swapping the element through one by one character using temp variable */
           char temp=inputStrCharArray[start];
           inputStrCharArray[start]=inputStrCharArray[end];
           inputStrCharArray[end]=temp;
   
           start++;
           end--;
        }
        return new String(inputStrCharArray);//returning the reversed string
    }
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);   
     System.out.println("Enter a String to reverse: ");

     String inputStr=sc.nextLine();//taking the input from the user

     String reverse=reverse(inputStr);//calling the reverse function and stored the result in reverse variable
     System.out.println("The user entered String is: "+inputStr);
     System.out.println("The reversed String is: "+reverse);

    }
}
//end of the Program