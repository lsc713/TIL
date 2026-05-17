import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =0;

        for (int i = 0; i < n; i++) {
            int num = k-arr[i];
            ans+=map.getOrDefault(num,0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
            
        System.out.println(ans);
        // Please write your code here.
    }
}