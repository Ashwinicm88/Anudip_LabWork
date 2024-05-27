package Lab3;

/*3)WAP to Reverse a string with the help of loop. */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("\nEnter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using loop 
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string is: " + reversedString);
        scanner.close();
    }
}
//end of the program