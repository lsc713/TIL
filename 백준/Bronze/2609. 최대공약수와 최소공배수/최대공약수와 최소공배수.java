import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        int lcm = a*b/gcd;
        System.out.println(gcd);
                System.out.println(lcm);
        
    }
    
    public static int gcd(int a, int b){
        while(b!=0){
         int tmp = a;
        a = b;
        b = tmp%b;   
        }
        return a ;
    }
}