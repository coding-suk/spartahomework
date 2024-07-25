package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firNum, secNum;
        String s;
        char sign;
        int result = 0;
        int[] intarr = new int[10];
        int count =0;
        int i;

        while (true) {
            firNum = sc.nextInt();
            System.out.println("첫 번째 숫자를 입력하세요: " + firNum);

            secNum = sc.nextInt();
            System.out.println("두 번쨰 숫자를 입력하세요: " + secNum);

            sign = sc.next().charAt(0);
            System.out.println("사칙연산 기호를 입력하세요: " + sign);

            if (sign == '+') {
                result = firNum + secNum;
            } else if (sign == '-') {
                result = firNum - secNum;
            } else if (sign == '*') {
                result = firNum * secNum;
            } else if (sign == '/') {
                if (secNum != 0) {
                    result = firNum / secNum;
                } else {
                    System.out.println("분모에는 0이 들어갈수 없습니다.");
                }
            }
            System.out.println("결과: " + result);
            if(intarr.length > 10) {
                for(i=1;i<intarr.length;i++){
                    intarr[i-1]=intarr[i];
                }
            }
            for(i =0;i<intarr.length;i++) {
                intarr[i] = result;
                count++;
            }



            System.out.println("더 계산하기겠습니까? (exit 입력 시 종료)");
            String sc1 = sc.next();
            if (sc1.equals("exit")) {
                break;
            }
        }
    }
}
