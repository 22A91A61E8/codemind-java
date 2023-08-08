import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        float a,b,h;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        h=sc.nextFloat();
        double t;
        t=(a+b)*h*0.5;
        System.out.printf("%.4f",t);
    }
}