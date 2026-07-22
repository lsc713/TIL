import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pq.add(-x);
            // Please write your code here.
        }
        for(int i = 0 ; i < m ; i++){
            int num = -pq.poll();
            pq.add(-num+1);
        }
        System.out.println(-pq.peek());
    }
}