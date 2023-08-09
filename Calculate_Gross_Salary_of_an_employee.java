import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        float hra,da,bs;
        Scanner sc=new Scanner(System.in);
        hra=sc.nextFloat();
        da=sc.nextFloat();
        bs=sc.nextFloat();
        double pf,gs;
        pf=0.12*hra;
        gs=bs+hra+da+pf;
        System.out.printf("%.2f%n%.2f",pf,gs);
    }
}