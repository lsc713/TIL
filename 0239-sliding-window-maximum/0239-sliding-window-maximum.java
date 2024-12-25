import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();//index를 저장
        int[] results = new int[nums.length-k+1];
        
        for(int i = 0 ;i<k;i++){
            while(!deque.isEmpty()&& nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        results[0]=nums[deque.peekFirst()];
        for(int i =k;i<nums.length;i++){
            while(!deque.isEmpty()&&deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            results[i-k+1]=nums[deque.peekFirst()];
        }
        
        return results;
    }
}