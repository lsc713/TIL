class Solution {
    public String solution(int num) {
//         String answer = "";
        
//         if(num % 2 ==0){
//             answer = "Even";
//         } else {
//             answer = "Odd";
//         }
//         return answer;
        
            String answer = "";

            answer = num % 2 == 0 ? "Even" : "Odd";

            return answer;
    }
}