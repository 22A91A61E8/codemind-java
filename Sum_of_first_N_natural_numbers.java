import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
          s=s+i;
        }
        System.out.printf("%d",s);
    }
}