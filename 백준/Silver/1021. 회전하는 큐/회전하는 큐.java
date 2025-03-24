import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1 ; i <= n ; i++){
            deque.add(i);
        }
        int count =0;
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            int targetIdx = deque.indexOf(arr[i]);
            int half;
            if(deque.size()%2==0){
                half = deque.size()/2-1;
            }else {
                half = deque.size()/2;
            }
            if (targetIdx <= half) {
                for (int j =0;j<targetIdx;j++){
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }else{
                for (int j = 0; j < deque.size() - targetIdx; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}