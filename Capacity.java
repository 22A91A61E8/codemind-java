import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int s,t,b;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        int c;
        c=2*s*t*b*512/1024;
        System.out.printf("%d KB",c);
        
        
    }
}