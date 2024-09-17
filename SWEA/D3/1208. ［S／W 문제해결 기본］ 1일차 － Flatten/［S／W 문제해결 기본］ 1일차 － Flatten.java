import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            int n = sc.nextInt();
            for (int i = 1; i <= 100; i++) {
                int item = sc.nextInt();
                if (item > 50) {
                    maxHeap.offer(item);
                } else {
                    minHeap.offer(item);
                }
            }
            while (n != 0) {
                int maxItem = maxHeap.poll();
                int minItem = minHeap.poll();
                maxItem--;
                minItem++;
                n--;
                if (n == 0) {
                    break;
                }
                maxHeap.offer(maxItem);
                minHeap.offer(minItem);
//                System.out.println("===========");
//                System.out.println(n);
//                System.out.println(maxItem);
//                System.out.println(minItem);

            }
            System.out.println("#"+t+" "+(maxHeap.peek()- minHeap.peek()));
        }
    }
}
