import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}