import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int n = sc.nextInt();
            PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> pq2 = new PriorityQueue<>();
            for(int i = 0 ; i < n ; i++){
                int num = sc.nextInt();
                if(pq1.isEmpty()||num<=pq1.peek()) pq1.add(num);
                else pq2.add(num);

                if(pq1.size()> pq2.size()+1) pq2.add(pq1.poll());
                else if(pq2.size() > pq1.size()) pq1.add(pq2.poll());

                if(i%2==0){
                    System.out.print(pq1.peek()+" ");
                }
            }
            System.out.println();
        }
        
        // Please write your code here.
    }
}