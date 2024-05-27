package Lab5;

public class OddThread extends Thread{
    public void run(){
    System.out.println("\nOdd numbers are: ");
        for(int i=1;i<=100;i+=2)
        {
                System.out.print(i+" ");
        }
}
}
