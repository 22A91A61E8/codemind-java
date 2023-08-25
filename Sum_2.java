import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b,x,y,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                sum=sum+i;
            }
        }
        System.out.printf("%d",sum);
    }
}