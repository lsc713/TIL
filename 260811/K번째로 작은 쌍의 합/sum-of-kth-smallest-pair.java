import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        PriorityQueue<long[]> pq = new PriorityQueue<>((x,y)->Long.compare(x[0],y[0]));

        int row = Math.min(k,n);
        for(int i = 0 ; i < row;i++){
            pq.add(new long[]{arr1[i] + arr2[0],i,0});
        }
        long answer = 0;
        for(int cnt = 0 ; cnt<k;cnt++){
            long[] cur = pq.poll();
            answer = cur[0];
            int i = (int) cur[1];
            int j = (int) cur[2];

            if(j+1 < m ){
                pq.add(new long[]{arr1[i]+arr2[j+1],i,j+1});
            }
        }
        System.out.println(answer);
    }
}