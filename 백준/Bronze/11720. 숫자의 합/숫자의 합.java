
import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        String a = sc.next();
        int answer=0;
        for (int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            answer+=c-'0';
        }
        System.out.println(answer);
    }
}
