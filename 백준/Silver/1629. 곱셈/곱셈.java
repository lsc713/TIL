import java.util.Scanner;

public class Main {

    static int c;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(calc(a,b));
    }

    private static long calc(int a, int b) {
        if(b==1){
            return a%c;
        }
        long temp = calc(a,b/2);
        if (b%2==1){
            return (temp*temp%c)*a%c;
        }
        return temp*temp%c;
    }
}