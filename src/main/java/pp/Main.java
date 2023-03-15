package pp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        String operator;
        int result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        num1 = sc.nextInt();

        System.out.println("연산자를 입력하세요.");
        operator = sc.next();

        System.out.println("두 번째 숫자를 입력하세요.");
        num2 = sc.nextInt();

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        }

        System.out.println("연산 결과는 " + result + " 입니다.");
    }
}
