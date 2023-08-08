import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        double a,p;
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.printf("%.2f%n%.2f",a,p);
    }
}