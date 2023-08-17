import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        if(N%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
    
}