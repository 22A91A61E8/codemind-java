import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args)
    {
        float c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        double f;
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}