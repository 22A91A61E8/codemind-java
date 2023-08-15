import java.util.Scanner;
public class ultimate
{
    public static void main(String[] args)
    {
        int a,i,n,c;
        c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=sc.nextInt();
            if(n>a)
            {
                c++;
            }
            
        }
        if(c==n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}