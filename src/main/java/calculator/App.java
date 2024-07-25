package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firNum, secNum;
        char sign;
        int result = 0;

        firNum = sc.nextInt();
        System.out.println("첫 번째 숫자를 입력하세요: " +firNum);

        secNum = sc.nextInt();
        System.out.println("두 번쨰 숫자를 입력하세요: " +secNum);

        sign = sc.next().charAt(0);
        System.out.println("사칙연산 기호를 입력하세요: " +sign);

        if (sign=='+') {
            result = firNum + secNum;
        } else if (sign == '-') {
            result = firNum - secNum;
        } else if (sign == '*') {
            result = firNum * secNum;
        } else if ( sign == '/') {
            if (secNum != 0) {
                result = firNum / secNum;
            } else {
                System.out.println("분모에는 0이 들어갈수 없습니다.");
            }
        }
    }
}
