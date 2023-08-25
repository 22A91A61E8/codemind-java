import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        long a,b;
        Scanner sc=new  Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        long hcf=0;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        long lcm=0;
        lcm=(a*b)/hcf;
        System.out.printf("%d",lcm);
    }
}