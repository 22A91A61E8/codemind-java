import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        for(int i=1;;i++)
        {
            a=sc.nextInt();
            if(a==-1)
            {
                break;
            }
            else
            {
                System.out.printf("%d
",a*a);
            }
        }
    }
}