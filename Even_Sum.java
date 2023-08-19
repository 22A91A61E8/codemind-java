import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] intArray=new int[n];
        for(int i=0;i<n;i++)
        {
            intArray[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(intArray[i]%2==0)
            {
                s=s+intArray[i];
            }
        }
        System.out.println(s);
        
    }
}