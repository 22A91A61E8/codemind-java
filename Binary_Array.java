import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0||arr[i]==1)
            {
                c=c+1;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}