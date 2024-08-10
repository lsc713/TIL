import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(factorial(n)/(factorial(m)*factorial(n-m)));
    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}