import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            //pq - asc , pq2 desc
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
            pq2.offer(A);
            int answer=0;
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                /*1.기본적으로 pq2가 커야됨
                2.집어넣을 최솟값이 pq2보다 크다? 그럼 pq로 ㄴ집어넣고 pq2애 작은걸넣는다
                * */
//                System.out.println(x+" "+y);
                if (pq2.peek() >= x) {
                    pq2.offer(x);
                }else{
                    pq.offer(x);
                }
                if (pq2.peek() >= y) {
                    pq2.offer(y);
                }else{
                    pq.offer(y);
                }
                if (pq2.size() < pq.size()) {
                    pq2.add(pq.poll());
                } else if (pq2.size() > pq.size() + 1) {
                    pq.offer(pq2.poll());
                }

//                System.out.println(pq);
//                System.out.println(pq2);
//                System.out.println(pq2.peek());
                answer = (answer+pq2.peek()) %20171109;
            }
            System.out.println("#"+t+" "+answer);
        }//tcR
    }//main
    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
