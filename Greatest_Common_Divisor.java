import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int i,gcd=0;
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.printf("%d",gcd);
    }
}