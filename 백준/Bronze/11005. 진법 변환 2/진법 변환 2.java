import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(n / b);
//        System.out.println(n % b);
        StringBuilder answer= new StringBuilder();
        while (n > 0) {
            int mo = n % b;

            if (mo >= 10) {
                answer.append((char) (mo + 'A' - 10));
            } else {
                answer.append((char) (mo + '0'));
            }
            n /= b;
        }
        System.out.println(answer.reverse());
    }

}
