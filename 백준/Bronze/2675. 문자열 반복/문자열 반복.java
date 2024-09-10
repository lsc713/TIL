
import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int R = sc.nextInt();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                for (int i = 0; i < R; i++) {
                    char c = str.charAt(j);
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
