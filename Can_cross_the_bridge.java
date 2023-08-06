import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int X,Y,Z;
        Scanner sc=new Scanner(System.in);
        X=sc.nextInt();
        Y=sc.nextInt();
        Z=sc.nextInt();
        int m;
        m=(Z-Y)/X;
        System.out.println(m);
    }
    
}