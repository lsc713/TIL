package org.example.Week02;

public class Q31extraordinaryString {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] arr = s.split("");

        for (String string : arr) {
            cnt = string.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? string.toLowerCase() : string.toUpperCase();
        }
       return answer;

    }

    public static void main(String[] args) {
        Q31extraordinaryString a = new Q31extraordinaryString();
        System.out.println(a.solution("asc").toString());
    }
}
