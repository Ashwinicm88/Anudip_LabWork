
// WAP to generate fibonacci series 0 1 1 2 3 5 8
public class FibonacciSeries {
    public static void main(String[] args) {
        //initializing values to num1,num2 and count to 6
        int num1=0,num2=1,count=6,fibo;
         
        System.out.print("Fibonacci Series is: "+num1+" "+num2);
        for(int i=2;i<=count;i++){

           //We are adding the num1 and num2 to make the fibonacci series
           fibo=num1+num2;
           System.out.print(" "+fibo+" ");// printing fibonacci Series

           //Swaping elements from num2 to num1 and fibo to num2
           num1=num2;
           num2=fibo;
        }
    }
}
//end of the program
