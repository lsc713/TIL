package org.week4;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }
}
