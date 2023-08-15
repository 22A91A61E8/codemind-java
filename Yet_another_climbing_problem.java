import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int x,i,y,n,r,e;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            r=x/y;
            e=x%y;
            System.out.printf("%d%n",r+e);
        }
    }
}