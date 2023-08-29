import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int[][] arr=new int[a][b];
        
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int se=0,so=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(arr[i][j]%2==0)
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
