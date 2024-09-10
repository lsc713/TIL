import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int tmp=0;
        int l = 0; int r = input.length()-1;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(r) == input.charAt(l)) {
                l++;
                r--;
            } else {
                System.out.println(0);
                tmp=1;
                break;
            }
        }
        if (tmp == 0) {
            System.out.println(1);

        }
    }
}
