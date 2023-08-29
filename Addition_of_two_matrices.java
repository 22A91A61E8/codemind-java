import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] d=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
        
            {
              a[i][j]=sc.nextInt();
            } 
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
        
            {
              b[i][j]=sc.nextInt();
            } 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              d[i][j]=a[i][j]+b[i][j];
            } 
            
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.print(d[i][j]+" ");
            }
            System.out.println();
        
        }
        

    }
}