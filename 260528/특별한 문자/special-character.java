import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        String ans = "None";


        for(char c : str){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Character k : map.keySet()){
            if (map.get(k)==1){
                ans=k.toString();
                break;
            }
        }

        System.out.println(ans);
        // Please write your code here.
    }
}