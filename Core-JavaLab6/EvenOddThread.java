package Lab5;
/*Create two threads to print odd numbers and even numbers from 1 to 100? */
//start of the Program
public class EvenOddThread extends Thread 
{
    public static void main(String[] args) {
        EvenAndOddThread evenObj=new EvenAndOddThread();//created the object of the class to access the even thread.
        evenObj.setName("even");

        EvenAndOddThread oddObj=new EvenAndOddThread();//created the object of the class to access the odd thread.
        oddObj.setName("odd");

        //started the both thread
        oddObj.start();
        evenObj.start();
    }
}

class EvenAndOddThread extends Thread{
    public void run(){
        synchronized(EvenAndOddThread.class){
            //when it will get even string at that time it will gives the even numbers and executes the thread
            if(Thread.currentThread().getName().equals("even"))
            {
                System.out.println("\nEven numbers are: ");
                for(int i=1;i<=100;i++)
                {
                    if(i%2==0)//checks whether number is even or not
                    {
                        System.out.print(i+ " ");//prints the even numbers
                    }
                }
            }
            //when it will get odd string at that time it will gives the even numbers and executes the thread
            if(Thread.currentThread().getName().equals("odd"))
            {
            System.out.println("Odd numbers are: ");
            for(int i=1;i<=100;i++)
            {
                if(i%2!=0)//checks whether number is odd or not
                {
                    System.out.print(i+" ");//prints the odd numbers
                }
            }
            }
        }
    }
}

//end of the Program
