import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            System.out.printf("%d x %d = %d
",a,i,a*i);
        }
    }
}