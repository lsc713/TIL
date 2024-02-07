package org.example.case3;

public class AddOperation extends AbstractOperation{

    @Override
    public double operate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = firstNumber + secondNumber;
        return answer;
    }
}
