import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b,c,d;
        b=(a/3600);
        c=(a-(3600*b))/60;
        d=(a-(3600*b)-(c*60));
        System.out.printf("H:M:S-%d:%d:%d",b,c,d);
    }
    
}