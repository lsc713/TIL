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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null|| lists.length==0)return null;
        if(lists.length==1)return lists[0];
        return mergeList(lists,0,lists.length-1);
    }
    ListNode mergeList(ListNode[] lists, int start, int end){
        if(start==end){
            return lists[start];
        }
        if(start+1==end){
            return mergeTwo(lists[start],lists[end]);
        }
        int mid = start + (end-start)/2;
        ListNode leftMerged = mergeList(lists,start,mid);
        ListNode rightMerged = mergeList(lists,mid+1,end);
        return mergeTwo(leftMerged,rightMerged);
    }

    ListNode mergeTwo(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current =dummy;

        while(l1 != null && l2 != null){
            if(l1.val <=l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2= l2.next;
            }
            current = current.next;
        }
        current.next = (l1!= null)? l1 : l2;
        return dummy.next;
    }

}