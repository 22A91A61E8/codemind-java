import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int k;
        k=n*(n-1)/2;
        System.out.println(k);
    }
}