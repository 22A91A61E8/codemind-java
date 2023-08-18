import java.util.Scanner;
public class ultimate
{
    public static void main(String[] args)
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.printf("%d",s);
    }
}
