import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        double c=(sum/n);
        System.out.printf("%.2f",c);
    }
}