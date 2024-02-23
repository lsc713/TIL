class Solution {
    public String solution(String s) {
//         String answer = "";
//         int cnt = 0;
//         String[] arr = s.split("");

//         for (String string : arr) {
//             cnt = string.contains(" ") ? 0 : cnt + 1;
//             answer += cnt % 2 == 0 ? string.toLowerCase() : string.toUpperCase();
//         }
//        return answer;
        
            StringBuilder sb = new StringBuilder();
            boolean toUpper = true;

            for(char c : s.toCharArray()){
                if (!Character.isAlphabetic(c)) {
                    sb.append(c);
                    toUpper = true;
                } else {
                    if (toUpper) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                    toUpper = !toUpper;
                }
            }
            return sb.toString();
    }
}