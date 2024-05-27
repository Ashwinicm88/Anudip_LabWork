package Lab1;

/*Finding greatest number among the three numbers */
import java.util.*;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking input from the users
        System.out.println("Enter 3 numbers: ");
        int numOne=sc.nextInt();
        int numTwo=sc.nextInt();
        int numThree=sc.nextInt();
        // Checking first number is greater than second and third using nested if
        if(numOne>numTwo){
            if(numOne>numThree){
                System.out.println("The Greatest Number is: "+numOne);
            }
        }
        //Checking whether second number is greater than third
        else if(numTwo>numThree){
            System.out.println("The Greatest Number is: "+numTwo);
        }
        else if(numThree>numTwo && numThree>numTwo){
            System.out.println("The greatest Number is: "+numThree);
        }
        sc.close();
    }
    
}
//End of the Program
