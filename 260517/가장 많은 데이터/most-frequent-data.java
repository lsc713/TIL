import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        Map<String,Integer> map = new HashMap<>();
        int ans =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            ans=Math.max(ans,map.get(arr[i]));
        }
        System.out.println(ans);
        // Please write your code here.
    }
}