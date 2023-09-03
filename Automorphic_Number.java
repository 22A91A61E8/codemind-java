import java.util.Scanner;
public class Ultimate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int square=n*n;
        int temp=n;
        while(temp>0)
        {
            c++;
            temp=temp/10;
        }
        int lastd=(int)(square%(Math.pow(10,c)));
        if(n==lastd)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
        

    }
}