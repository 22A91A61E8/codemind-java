import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.print(sum+" ");
            sum=0;
        }
        
    }
}