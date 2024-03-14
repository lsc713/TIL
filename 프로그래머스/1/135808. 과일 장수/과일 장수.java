import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < score.length;i++){
            pq.add(score[i]);
        }
        while(pq.size()>=m){
            for(int i = 0; i< m ;i++){
                if(i == m-1){
                    answer += (pq.poll()*m);
                }else{
                    pq.poll();
                }
            }
        }
        return answer;
    }
}