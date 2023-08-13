import java.util.Scanner;
public class Ultimate
{
    public static void main(String[] args)
    {
        float N,M;
        Scanner sc=new Scanner(System.in);
        N=sc.nextFloat();
        M=sc.nextFloat();
        float avg;
        avg=(N+M)/2;
        System.out.printf("%.4f",avg);
    }
}