import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=n;i++)
        {
            sum1+=i*i;
            sum2+=i;
        }
        System.out.println(Math.abs(sum2*sum2-sum1));
    }
}