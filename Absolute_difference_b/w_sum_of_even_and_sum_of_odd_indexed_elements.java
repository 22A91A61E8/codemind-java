import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        int es=0,os=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i%2==0)
            {
                es=es+arr[i];
            }
            else if(i%2!=0)
            {
                os=os+arr[i];
            }
        }
        if(os>es)
        {
        System.out.println(Math.abs(es-os));
        }
        else
        {
            System.out.println(Math.abs(os-es));
        }
    }
}