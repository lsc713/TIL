package org.example;

/**
 * 설계도의 생성, 계산기 기능을 생성. 매개변수로 연산자와 피연산자를 받으면 answer로 반환.
 *
 * 멤버변수 및 생성자는 따로 없고 Main에서 생성 및 초기화
 */
public class Calculator1 {
    double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;
        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = (double) firstNumber / secondNumber;
        } else if (operator.equals("%")) {
            answer = firstNumber % secondNumber;

        }
        return answer;
    }

}
