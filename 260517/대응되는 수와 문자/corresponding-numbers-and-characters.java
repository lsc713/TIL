import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n + 1];
        Map<String,Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            words[i] = sc.next();
            map.put(words[i],i);
        }
        for(int i=0;i<m;i++){
            String number = sc.next();
            if(Character.isDigit(number.charAt(0))){
                int num = Integer.parseInt(number);
                System.out.println(words[num]);
            }else{
                System.out.println(map.get(number));
            }
        }
        
        // Please write your code here.
    }
}