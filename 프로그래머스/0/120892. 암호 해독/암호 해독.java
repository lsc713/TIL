class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int input = cipher.length();
        for(int i =code-1;i<input;i+=code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}