import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Negative Number");
        }
    }
    
}