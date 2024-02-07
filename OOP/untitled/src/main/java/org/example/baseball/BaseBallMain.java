package org.example.baseball;

import java.util.List;

public class BaseBallMain {

    public static void main(String[] args) {
        RandomNumber ranNum = new RandomNumber();
        Input input = new Input();
        Ball ball = new Ball();

        while (true) {
            List<Integer> comNum = ranNum.create();
            String result ="";
            while (!result.equals("3S")) {
                result = ball.judge(comNum, input.playerNumber());
                System.out.println(result);
            }
            break;
        }
    }


}
