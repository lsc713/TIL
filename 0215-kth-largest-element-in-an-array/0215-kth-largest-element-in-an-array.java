import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());        
        for(int num : nums){
            pq.offer(num);
        }
        int idx =1;
        while(idx!=k){
            idx++;
            pq.poll();
        }
        return pq.peek();

    }
}