class Solution {
    // public String solution(String s, int n) {
//         String answer = "";
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (Character.isLowerCase(ch)) {
//                 ch = (char) ((ch - 'a' + n) % 26 + 'a');
//             } else if (Character.isUpperCase(ch)) {
//                 ch = (char) ((ch - 'A' + n) % 26 + 'A');
//             }
//             answer+=ch;
//         }
//         return answer;
    // }
    
    private char push(char c, int n){
            if (!Character.isAlphabetic(c))return c;

            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            int position = c-offset;
            position = (position+n) % ('Z'-'A'+1);
            return (char) (offset + position);
        }

        public String solution(String s, int n) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()){
                sb.append(push(c, n));
            }
            return sb.toString();
        }
}
