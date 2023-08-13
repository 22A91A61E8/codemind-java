import java.util.Scanner;
public class Ultimate
{
    public static void main(String[] args)
    {
        int n,x;
        String a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=sc.next();
            x=Integer.parseInt(a,8);
            System.out.println(Integer.toString(x,2));
        }
        
    }
}
