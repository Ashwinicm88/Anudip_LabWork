package Lab5;

public class EvenThread extends Thread{
    public void run(){
        System.out.println("Even Numbers are: ");
        for(int i=2;i<=100;i+=2)
        {
                System.out.print(i+" ");
        }   
}
}
