import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int t,s,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int k;
        k=2*t*s*b*512;
        System.out.println(k);
    }
}