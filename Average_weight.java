import java.util.Scanner;
public class Weight{
    public static void main(String args[]){
        int x,a,b;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        c=3*x-a-b;
        System.out.println(c);
    }
}