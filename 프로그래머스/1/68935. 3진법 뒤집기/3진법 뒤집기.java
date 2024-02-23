class Solution {
    public int solution(int n) {
        // int answer = 0;
        // String s = "";
        // while (n != 0) {
        //     s +=n%3;
        //     n /= 3;
        // }
        // return Integer.parseInt(s, 3);
            String str = Integer.toString(n,3);
            String reversed = new StringBuilder(str).reverse().toString();
            return Integer.valueOf(reversed,3);
        }

}