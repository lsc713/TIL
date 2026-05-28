import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
        // Please write your code here.
    }
}