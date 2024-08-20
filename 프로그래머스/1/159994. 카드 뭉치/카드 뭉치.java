import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    String answer = "Yes";
    Deque<String> q1 = new ArrayDeque<>();
    Deque<String> q2 = new ArrayDeque<>();
    for(int i = 0 ; i < cards1.length;i++){
        q1.addFirst(cards1[i]);
    }
    for(int i = 0 ; i < cards2.length;i++){
        q2.addFirst(cards2[i]);
    }
    for(int i = 0;i<goal.length;i++){
        String q1String=q1.peekLast();
        String q2String=q2.peekLast();
        if(goal[i].equals(q1String)){
            String tmpe = q1.removeLast();
            System.out.println(tmpe);
        }else if(goal[i].equals(q2String)) {
        	q2.removeLast();
        }else{
            System.out.println(goal[i]);
            answer="No";break;
        }
    }
    return answer;
}
}
