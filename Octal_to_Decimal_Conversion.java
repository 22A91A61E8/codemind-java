import java.util.Scanner;
public class Ultimate{
    public static void main(String[] args){
        String OctalString="a";
        Scanner sc=new Scanner(System.in);
        OctalString=sc.nextLine();
        int decimal=Integer.parseInt(OctalString,8);
        System.out.println(decimal);
        
    }
}