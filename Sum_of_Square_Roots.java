import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        double s=0;
        for(int i=a;i<=b;i++)
        {
            s+=Math.sqrt(i);
        }
        System.out.printf("%.2f",s);
    }
}