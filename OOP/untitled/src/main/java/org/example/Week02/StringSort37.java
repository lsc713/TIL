package org.example.Week02;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort37 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        StringSort37 a = new StringSort37();
        a.solution(new String[]{"sun", "Bed", "car"}, 1);


    }
}
