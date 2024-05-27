/* Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter of a square, a rectangle and a circle.4
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r */
package Lab3;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            // Taking the choice from the user
            System.out.println("Enter the your choice to calculate perimeter of square or rectangle or circle: ");
            
            System.out.println("**Menu**\n"+"1.Perimeter of Square\n"+"2.Perimeter of Rectangle\n"+"3.Perimeter of Circle\n"+"4.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                //Calculating the Perimeter of Square
                    System.out.println("Enter the side of Square: ");
                    int side=sc.nextInt();
                    System.out.println("Perimeter of Square is: "+(side*4)+"\n");
                    break;
                case 2:
                //Calculating the Perimeter of Rectangle
                    System.out.println("Enter the Length and Breadth of Rectangle: ");
                    int length=sc.nextInt();
                    int breadth=sc.nextInt();
                    System.out.println("Perimeter of Rectangle is: "+(2*(length*breadth))+"\n");
                    break;
                case 3:
                //Calculating the Perimeter of Circle
                    System.out.println("Enter the radius of Circle: ");
                    double radius=sc.nextDouble();
                    System.out.println("Perimeter of Circle is: "+(2*3.14*radius)+"\n");
                    break;
                case 4:
                    System.out.println("Thank you, Have a Nice Day...!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            sc.close();
            }
        }
      
    }
}
//end of the Program
