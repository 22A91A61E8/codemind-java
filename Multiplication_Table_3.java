import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b,i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}