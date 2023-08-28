import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int se=0,so=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i%2==0)
                {
                    se=se+arr[i][j];
                }
                else
                {
                    so=so+arr[i][j];
                }
            }
            
        }
        System.out.print(se+" ");
        System.out.print(so);
    }
}