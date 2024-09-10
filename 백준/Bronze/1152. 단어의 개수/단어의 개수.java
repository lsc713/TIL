import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input=input.trim();
        int answer=0;

        String[] strArr = input.split(" ");

        answer=strArr.length;
        if (input.equals("")) {
            answer = 0;
        }
        System.out.println(answer);
    }
}
