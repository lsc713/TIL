import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < a ;i++){
            String b = sc.nextLine();
            if(isValid(b)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");}
               }
        }
            
            
           private static boolean isValid(String b){
               Stack<Character> stack = new Stack<>();
            for(int j = 0; j < b.length();j++){
                char c = b.charAt(j);
                if(c == '('){
                    stack.push(c);
                }else if(c==')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
            }
               return stack.isEmpty();
            
    }
}