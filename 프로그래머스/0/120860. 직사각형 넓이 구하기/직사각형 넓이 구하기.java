import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a=Math.abs(dots[0][0]-dots[1][0]);
        int b=Math.abs(dots[0][1]-dots[3][1]);
        int c=Math.abs(dots[0][0]-dots[2][0]);
        int d=Math.abs(dots[0][1]-dots[2][1]);
        answer=Math.max(a,c)*Math.max(b,d);
        // System.out.println(Arrays.deepToString(dots));
        return answer;
    }
}