import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s;
        s=n*(n+1)/2;
        System.out.printf("%d",s);
    }
}