import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = n; i >=1; i--) {
            for (int j =i-1; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n-2*i+1; j=j+1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j =i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= 2*n-2*i; j=j+1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
