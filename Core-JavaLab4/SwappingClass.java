package Lab4;
/*Question:- WAP to swap two numbers without using third variable using class and object concept. */

//Start of the Program
public class SwappingClass {
    //created the method called swap with 2 paramterized
    public void swap(int numberOne,int numberTwo){
        //printing the user entered values before swapping
        System.out.println("The user enterd number is number1: "+numberOne+ "\n Number2: "+numberTwo);

        //doing swap without using third variable by doing a addition and subtraction of two numbers
        numberOne=numberOne+numberTwo;
        numberTwo=numberOne-numberTwo;
        numberOne=numberTwo-numberOne;

        //printing the values after swapping operation
        System.out.println("The Swapped numbers are: \n"+"Number1: "+numberOne+"\nNumber2: "+numberTwo);
    }
}
// End of the Program