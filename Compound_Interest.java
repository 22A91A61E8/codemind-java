import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        double P,R,T;
        Scanner sc=new Scanner(System.in);
        P=sc.nextDouble();
        R=sc.nextDouble();
        T=sc.nextDouble();
        double CI;
        CI=P*Math.pow((1+R/100),T)-P;
        System.out.printf("%.2f",CI);
        
    }
}