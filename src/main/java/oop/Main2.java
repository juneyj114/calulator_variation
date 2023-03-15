package oop;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        String operator;
        int result = 0;

        Calculator calculator = new Calculator();
        InputReceiver inputReceiver = new InputReceiver();

        num1 = inputReceiver.getFirstNum();
        operator = inputReceiver.getOperator();
        num2 = inputReceiver.getSecondNum();

        result = calculator.calculate(num1, num2, operator);

        System.out.println("연산 결과는 " + result + " 입니다.");

    }

}
