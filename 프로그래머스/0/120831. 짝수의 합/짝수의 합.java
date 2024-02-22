class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 2;
        while (n > 1) {
            answer += a;
            a += 2;
            n -= 2;
        }
        return answer;
    }
}