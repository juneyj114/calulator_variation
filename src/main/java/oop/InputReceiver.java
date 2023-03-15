package oop;

import java.util.Scanner;

public class InputReceiver {
    //TODO 생성자를 이용해 Scanner 반복 제거

    public int getFirstNum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int firstNum = sc.nextInt();
        return firstNum;
    }

    public String getOperator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("연산자를 입력하세요.");
        String operator = sc.next();
        return operator;
    }

    public int getSecondNum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 번째 숫자를 입력하세요.");
        int secondNum = sc.nextInt();
        return secondNum;
    }
}
