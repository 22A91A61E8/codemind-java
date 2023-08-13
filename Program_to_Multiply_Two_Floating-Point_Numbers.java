import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        double c;
        c=a*b;
        System.out.printf("%.2f",c);
    }
}