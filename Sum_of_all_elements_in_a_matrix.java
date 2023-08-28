import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
              arr[i][j]=sc.nextInt(); 
          }
            
        }
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum=sum+arr[i][j];
            }
            
        }
        System.out.print(sum);
    }
}