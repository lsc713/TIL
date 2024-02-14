class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (answer >= 1) {
                break;
            }
            if (n % i == 1) {
                answer += i;

            }
        }
        return answer;
    }
}