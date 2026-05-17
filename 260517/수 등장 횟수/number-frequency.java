import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
            if(map.containsKey(queries[i])){
                System.out.print(map.get(queries[i]) + " ");    
            }else{
                System.out.print(0 + " ");    
            }
            
        }
        

        // Please write your code here.
    }
}