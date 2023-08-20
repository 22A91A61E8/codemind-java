import java.util.Scanner;
public class Ultimate
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}