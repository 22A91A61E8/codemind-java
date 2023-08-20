import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
          int r=n%10;
          s=s*10+r;
          n=n/10;
        }
        System.out.println(s);
    }
}