class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (b >= a) {
            for (a = a; a <= b; a++) {
                answer += a;
            }
        } else {
            for (b = b; b <= a; b++) {
                answer+=b;
            }
        }


        return answer;
    }
}