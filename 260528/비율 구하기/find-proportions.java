import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new TreeMap<>();
        for(int i = 0 ; i < n ; i ++){
            String s = sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Entry<String,Integer> entry = it.next();
            double d = (double) entry.getValue()/n * 100;
            String string = String.format("%.4f",d);
            System.out.println(entry.getKey() + " " + string);
        }
        // Please write your code here.
    }
}