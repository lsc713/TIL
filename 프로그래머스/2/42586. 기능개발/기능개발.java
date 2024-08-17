import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Deque<Integer> arr = new ArrayDeque<>();
        for(int i = 0;i<progresses.length;i++){
            double temp = Math.ceil((double)(100-progresses[i])/speeds[i]);
            arr.addLast((int)temp);
        }
        List<Integer> list = new ArrayList<>();
        while(!arr.isEmpty()){
            int cnt=1;
            int popItem=arr.pop();
            while(!arr.isEmpty() && popItem >= arr.peek()){
                arr.remove();
                cnt++;
            }
            list.add(cnt);
        }
        return list;
    }
}