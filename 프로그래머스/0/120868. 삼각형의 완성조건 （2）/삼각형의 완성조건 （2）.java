import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int tmp = sides[0];
        //sides[1]이 가장 긴 경우, + sides[1]+sides[0]이 두변인경우
        int a= sides[1]+sides[0];
        if(sides[1]-tmp<sides[1]){
            answer=sides[1] -(sides[1]-tmp);
        }
        answer+=a-sides[1]-1;
        return answer;
    }
}