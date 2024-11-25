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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);//정답을 위한 노드
        ListNode curr = dummy;//포인터노드
        int carry =0;//올림 자리 개산 용 변수
        while(l1 != null || l2 != null){
            int x = (l1!=null)? l1.val:0;
            int y = (l2!=null)? l2.val:0;
            int sum = carry+x+y;//올림자리수와 각 리스트 내용을 더함 case3에서 볼 수 있듯, Null이면 0으로 대체
            carry = sum/10;
            curr.next = new ListNode(sum%10);//다음자리에 계산값을두고 curr을 옮겨준다.
            curr=curr.next;
            //각 listNode가 null이 아니면 다음을 바라보도록 바꿔준다.
            if(l1 !=null)l1=l1.next;
            if(l2 != null)l2=l2.next;
        }
        if(carry>0){
            curr.next =new ListNode(carry);
        }
        
        return dummy.next;
    }
}