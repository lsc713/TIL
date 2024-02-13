class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int[] size : sizes) {

            cnt1 = Math.max(cnt1, Math.max(size[0], size[1]));
            cnt2 = Math.max(cnt2, Math.min(size[0], size[1]));
        }
        answer = cnt1 * cnt2;
        return answer;
    }
}