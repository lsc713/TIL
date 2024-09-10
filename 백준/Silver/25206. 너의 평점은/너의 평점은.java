import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class Main{
    static Character char1[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        double answer = 0;
        int subject = 20;
        double sum =0;

        for (int i = 0; i < 20; i++) {
            String input = sc.nextLine();
            String[] words = input.split(" ");
            double score = Double.parseDouble(words[1]);
            if (!words[2].equals("P")) {
                sum+= score;
            }
            String grade = words[2];
            if (grade.equals("A+")) {
                answer += score * 4.5;
            }else if (grade.equals("A0")) {
                answer += score * 4.0;
            }else if (grade.equals("B+")) {
                answer += score * 3.5;
            }else if (grade.equals("B0")) {
                answer += score * 3.0;
            }else if (grade.equals("C+")) {
                answer += score * 2.5;
            }else if (grade.equals("C0")) {
                answer += score * 2.0;
            }else if (grade.equals("D+")) {
                answer += score * 1.5;
            }else if (grade.equals("D0")) {
                answer += score * 1.0;
            } else if (grade.equals("F")) {
                answer += score * 0.0;
            } else {
//                answer += score;
            }
        }
        System.out.println(answer/sum);
    }
}
