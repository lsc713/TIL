package org.example.baseball;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    public int random() {
        Random random = new Random();
        return random.nextInt(9)+1;
    }


    public List<Integer> create() {
        List<Integer> comNumber = new ArrayList<>();
        while (comNumber.size() < 3) {
            int randomNumber = random();
            if (comNumber.contains(randomNumber)) {
                continue;
            } else {
                comNumber.add(randomNumber);
            }
        }
        return comNumber;
    }
}
