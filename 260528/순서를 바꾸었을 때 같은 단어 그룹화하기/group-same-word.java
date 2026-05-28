import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] word = sc.next().toCharArray();
            Arrays.sort(word);
            String cWord = new String(word);
            map.put(cWord,map.getOrDefault(cWord,0)+1);
        }
        int ans =0;
        for(Integer v : map.values()){
            ans=Math.max(ans,v);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}