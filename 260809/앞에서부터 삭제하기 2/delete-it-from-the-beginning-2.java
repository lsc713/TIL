import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum =0;
        long bestNum=-1;
        long bestDen = 1;/////////s
        for(int k = n-1; k>=1;k--){
            pq.add(arr[k]);
            sum+=arr[k];

            int cnt = n-k;
            if(cnt<2)continue;
            long num = sum-pq.peek();
            long den = cnt-1;
            if(bestNum<0|| num * bestDen > bestNum * den){
                bestNum = num;
                bestDen = den;
            }
            
        }
            

        System.out.printf("%.2f%n",(double)bestNum/bestDen);
        // Please write your code here.
    }
}