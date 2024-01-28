package org.example.case2;


/**
 *
 * case1에서 각 피연산자를 클래스로 분리하고 기능을 개선, 생성자를 통해 각 클래스를 한번에 초기화.
 */
public class Calculator2 {

    AddOperation addOperation;
    SubstractOperation substractOperation;
    MultiplyOperation multiplyOperation;
    DivideOperation divideOperation;

    public Calculator2(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }


    public double calculate(String operator, int firstNumber, int secondNumber) {

        double answer = 0;
        if (operator.equals("+")) {
            answer = addOperation.operate(firstNumber,secondNumber);
        } else if (operator.equals("-")) {
            answer = substractOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber);
        }
        return answer;
    }
}
