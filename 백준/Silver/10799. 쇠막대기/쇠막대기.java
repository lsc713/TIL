import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Stack<Character> stack = new Stack<>();
        int result =0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(c);
            }else{
                stack.pop();
                if (input.charAt(i - 1) == '(') {
                    result += stack.size();
                }else{
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
