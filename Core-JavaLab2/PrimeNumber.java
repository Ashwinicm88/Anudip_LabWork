//Wap to check whether the entered number is prime or not
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from the user
        System.out.println("Enter a number to check whether it is prime or not: ");
        int num = sc.nextInt();

        int flag = 0; // set the flag equal to zero
        // if the user entered number is 0 or 1 then it is not a prime number
        if (num == 0 || num == 1) {
            System.out.println("It is not a Prime number");
        } else {
            // we are starting the loop from 2 and dividing num by every number from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                // if num is divisible by any number from 2 to num/2 then it is not a prime
                // number
                if (num % i == 0) {
                    System.out.println(num + " is not a Prime number");
                    // we are setting the flag because it is not a prime number
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) // if flag==0 then it is prime number
            {
                System.out.println(num + " is a Prime number");
            }
        }
        sc.close();
    }
}
