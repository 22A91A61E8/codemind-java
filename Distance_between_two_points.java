import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        double d;
        d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.printf("%.4f",d);
        
    }
}