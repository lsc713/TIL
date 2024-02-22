import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        // int answer = 0;
        // int a = 2;
        // while (n > 1) {
        //     answer += a;
        //     a += 2;
        //     n -= 2;
        // }
        // return answer;
        return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
    }
}