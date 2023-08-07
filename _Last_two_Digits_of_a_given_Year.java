import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b;
        b=a%100;
        System.out.printf("%02d",b);
    }
}