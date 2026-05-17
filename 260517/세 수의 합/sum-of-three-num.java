import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n-2;i++){
            Map<Integer,Integer> map = new HashMap<>();
            int target = k-arr[i];
            for(int j=i+1;j<n;j++){
                int num = target-arr[j];
                ans+=map.getOrDefault(num,0);
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
}