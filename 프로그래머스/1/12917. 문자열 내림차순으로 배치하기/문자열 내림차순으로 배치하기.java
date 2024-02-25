import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
            Arrays.sort(str);

            StringBuilder sb = new StringBuilder();
            sb.append(String.join("",str));
            return sb.reverse().toString();
    }
}