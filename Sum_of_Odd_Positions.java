import java.util.Scanner;
public class Ultimate
{
    public static void main(String[] args)
    {
       
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] intArray=new int[n];
        for(int i=0;i<n;i++)
        {
            intArray[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                sum+=intArray[i];
            }
        }
        System.out.println(sum);
    }
}