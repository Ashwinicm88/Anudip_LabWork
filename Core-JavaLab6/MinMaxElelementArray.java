package Lab5;
/* Write a program that asks the user to input ten integers and stores them in an array.
 The program should then find and print the smallest and largest values in the array */
//start of the Program
import java.util.Scanner;//imported the scanner for i/p purpose.
public class MinMaxElelementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//created the scanner class object.
        System.out.println("Enter 10 numbers: ");

        //created array of integer data type with the size of 10
        int number[]=new int[10];

        for(int i=0;i<number.length;i++)
        {
            number[i]=sc.nextInt();//iterating for loop for 10 elements through the array
        }
        //initiating min and max variable at array position 0.
        int min=number[0];
        int max=number[0];
        System.out.println("The numbers are: ");

        for(int i=0;i<number.length;i++)
        {
            //Printing the all numbers through loop
            System.out.print(number[i]+" ");
            if(min>number[i])//comparing each number with the min element to get minimum number
            {
                min=number[i];//storing the min element from array
            }
            else if(max<number[i])//comparing each number with the man element to get maximum number
            {
                max=number[i];//storing the max element from array
            }   
        }
        /* Printing the smallest and largest element in the array */
        System.out.println("\nSmallest element is : "+min);
        System.out.println("Largest element is : "+max);

    sc.close();//closing scanner class object.
    }
    
}
//end of the Program