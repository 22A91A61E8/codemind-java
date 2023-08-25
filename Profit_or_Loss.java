import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(b>a)
        {
            System.out.println("Profit");
            
        }
        else if(a>b)
        {
            System.out.println("Loss");
        }
        else if(a==b)
        {
            System.out.println("No profit and No loss");
        }
    }
}