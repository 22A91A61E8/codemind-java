import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int a,b;
        a=x*5+y*10;
        b=a/z;
        System.out.printf("%d",b);
        
    }
}