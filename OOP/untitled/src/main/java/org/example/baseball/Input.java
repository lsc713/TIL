package org.example.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> playerNumber() {
        System.out.println("input 3 numbers");
        Scanner sc = new Scanner(System.in);
        List<Integer> playerNum = new ArrayList<>();
        String input = sc.next();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}
