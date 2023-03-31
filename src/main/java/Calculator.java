package com.knoldus.interoperable;

public class Calculator {

    static int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    static int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    static int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    static double divide(double firstOperand, double secondOperand) {
        if (secondOperand == 0)
            throw new ArithmeticException();
        else return firstOperand / secondOperand;
    }
}