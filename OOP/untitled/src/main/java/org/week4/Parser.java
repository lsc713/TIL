package org.week4;

import org.example.case3.AddOperation;
import org.example.case3.DivideOperation;
import org.example.case3.MultiplyOperation;
import org.example.case3.SubstractOperation;

import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        boolean matches = Pattern.matches(NUMBER_REG, firstInput);
        if (!matches) {
            throw new BadInputException("int");
        }
        this.calculator.setFirstNumber(parseInt(firstInput));

        return this;


    }

    public Parser parseSecondNum(String secondInput) throws BadInputException{
        boolean matches = Pattern.matches(NUMBER_REG, secondInput);
        if (!matches) {
            throw new BadInputException("int");
        }
        this.calculator.setSecondNumber(parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException{
        boolean matches = Pattern.matches(OPERATION_REG, operationInput);
        if (!matches) {
            throw new BadInputException("연산자");
        }
        switch (operationInput) {
            case "+" -> {
                this.calculator.setOperation(new AddOperation());
            }
            case "-" -> {
                this.calculator.setOperation(new SubstractOperation());
            }
            case "*" -> {
                this.calculator.setOperation(new MultiplyOperation());
            }
            case "/" -> {
                this.calculator.setOperation(new DivideOperation());
            }
        }


        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}