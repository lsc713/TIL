package org.example.string;

public class NumberStringWord {
    private static final String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public int solution(String s) {
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        NumberStringWord s = new NumberStringWord();
        System.out.println(s.solution("one4"));

    }

}
