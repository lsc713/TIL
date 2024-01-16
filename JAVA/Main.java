import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            if(i == a){
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "*" + j + " = " + (i * j) + "입니다.");
            }
        }

    }
}
