/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        boolean answer = true;
        while(stack.size()>1) {
            if(stack.pollFirst()!=stack.pollLast()) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}