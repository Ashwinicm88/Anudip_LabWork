
/*WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have
salary more than 50000 and He should be citizen of INDIA.Otherwise Loan can't be given to customer. */
import java.util.*;
public class Loan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking salary from user input
        System.out.println("Enter a Salary: ");
        double salary=sc.nextDouble();

        //Taking country name from user input
        System.out.println("Enter a your country: ");
        String citizen=sc.next();

        /*Checking whether a customer is having salary greater
         than 50000 and country name should be India */
        if(salary>=50000 && citizen.equals("India"))
        {
            System.out.println("Congragulation, You got a Loan...!!!");
        }
        else
        {
            System.out.println("Sorry, You didn't get a Loan...!!!");
        }
        sc.close();
    }
}
//end of the program