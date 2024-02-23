package org.example.string;

public class count_py {

    boolean Solution(String s){
//        s = s.toLowerCase();
//        int ps = s.length() - s.replace("p", "").length();
//        int ys = s.length() - s.replace("y", "").length();
//        return ps == ys;

        int ps = 0;
        int ys = 0;
        for (char c : s.toCharArray()) {
            switch(c){
                case 'p', 'P'-> ps++;
                case 'y','Y' -> ys++;

            }
        }
        return ps==ys;
    }
}
