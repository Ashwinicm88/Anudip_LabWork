/*)Write a program in Java to 
accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the 
income tax as per the given tariff: */

package Lab3;
import java.util.*;
public class IncomeTax {
    public static double calculateIncomeTax(double salary){
        double incomeTax=0;

        //if emp have a 250000 less than salary they no need to pay tax
        if(salary<=250000){
            incomeTax=0;
        }

        //if emp having more than 250001 salary then emp need to pay the 10% tax
        else if(salary>=250001 && salary<=500000){
            incomeTax=(salary-250000)*0.1;
        }

        //if emp having more than 500001 salary then emp need to pay the 20% tax
        else if(salary>=500001 && salary<=1000000 ){
            incomeTax = 30000 + (salary - 500000) * 0.2;
            
        }

        //if emp having more than 1000001 salary then emp need to pay the 30% tax
        else if(salary>=1000001){
            incomeTax=50000+((salary-1000000)*0.3);
        }
        return incomeTax;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // Taking the input from user
        System.out.println("Enter a Employee Name: ");
        String empName=sc.nextLine();
        System.out.println("Enter a Annual income of Employee: ");
        double salary=sc.nextDouble();

        //calling function to calculate the tax
        double tax=calculateIncomeTax(salary);

        sc.close();
        //displaying the result of the Employee
        System.out.println("\n**Employee Details**");
        System.out.println("Employee Name: "+empName);
        System.out.println("Income Tax: "+tax);
    }
}
//end of the Program.


