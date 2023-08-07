import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b,c;
        b=(a/365);
        c=(a-(b*365))/7;
        System.out.printf("%d%n%d",b,c);
        
    }
}