package oop;

public class Calculator {

    public int calculate(int num1, int num2, String operator) {

        int result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        }

        return result;

    }

//    public int calculate(int num1, int num2, String operator) {
//
//        int result = 0;
//
//        if (isAdd(operator)) {
//            result = num1 + num2;
//        } else if (isMinus(operator)) {
//            result = num1 - num2;
//        } else if (isMultiply(operator)) {
//            result = num1 * num2;
//        }
//
//        return result;
//
//    }
//
//    public boolean isAdd(String operator) {
//        return operator.equals("+");
//    }
//
//    public boolean isMinus(String operator) {
//        return operator.equals("-");
//    }
//
//    public boolean isMultiply(String operator) {
//        return operator.equals("*");
//    }
}
