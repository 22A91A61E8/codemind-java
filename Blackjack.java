import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=21-a-b;
        if(c>=1&&c<=10)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print(-1);
        }
    }
}