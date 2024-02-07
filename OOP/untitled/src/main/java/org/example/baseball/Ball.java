package org.example.baseball;

import java.util.List;

public class Ball {
    Compare compare = new Compare();

    public String judge(List<Integer> computer, List<Integer> player) {
        int total = compare.compare(computer, player);
        int strike = compare.strike(computer, player);
        int ball = total - strike;

        if (total == 0) {
            return "0B0S";
        } else if (strike == 0) {
            return ball + "B";
        } else if (ball == 0) {
            return strike + "S";
        }
        return ball+"B"+strike+"S";
    }
}
