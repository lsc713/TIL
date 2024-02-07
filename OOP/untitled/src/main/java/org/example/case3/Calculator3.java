package org.example.case3;

public class Calculator3 {

    AbstractOperation operate;

    public Calculator3(AbstractOperation operate) {
        this.operate = operate;
    }

    public void setOperate(AbstractOperation operate) {
        this.operate = operate;
    }


    public double calculate(int firstNumber, int secondNumber) {

        double answer = 0;

        answer = operate.operate(firstNumber, secondNumber);

        return answer;
    }
}
