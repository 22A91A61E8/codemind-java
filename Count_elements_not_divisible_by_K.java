import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%k!=0)
            {
                c=c+1;
            }

        }
         System.out.print(c);

    }
}