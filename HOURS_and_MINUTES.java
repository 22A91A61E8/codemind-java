import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        int h,min;
        h=m/60;
        min=m%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,min);
    }
}