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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next =null;
        ListNode left = sortList(head);
        ListNode right = sortList(secondHalf);
        return merge(left,right);
    }
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1!=null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
        }
        if(l2!=null){
            current.next=l2;
        }
        return dummy.next;
    }
}