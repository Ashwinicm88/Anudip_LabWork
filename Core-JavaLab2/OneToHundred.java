//WAP to generate even and odd numbers between 1 and 100
public class OneToHundred {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100:");

        /*starting loop from 2 beacuse even numbers are start from 2 and adding 2 to the number we
        always get an even number.
        */
        for (int i = 2; i <= 100; i += 2) 
        {
            System.out.print(i + " ");//printing the even numbers
        }
        
        System.out.println("\nOdd numbers between 1 and 100:");

         /*starting loop from 1 beacuse odd numbers are start from 1 and adding 2 to the number we
        always get an odd number.
        */
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");//printing the odd numbers
        }
    }
}
//end of the program