package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int firNum, secNum;
        String s, ss;
        char sign;
        int result = 0;
//        int[] intarr = new int[10];
        int count = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firNum = sc.nextInt();

            System.out.print("두 번쨰 숫자를 입력하세요: ");
            secNum = sc.nextInt();


            System.out.print("사칙연산 기호를 입력하세요: ");
            sign = sc.next().charAt(0);

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
            for (int i = 0; i < list.size(); i++) {
                list.add(result);
                count++;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제");
            ss = sc.nextLine();
            if (ss.equals("remove")) {
                list.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠니까? (inquriy 입력 시 조회) ");
            ss = sc.nextLine();
            for(int a : list) {
                System.out.print(list.toString());
            }

            System.out.println("더 계산하기겠습니까? (exit 입력 시 종료 OR 종료하지 않으려면 아무거나 누르세요)");
            String sc1 = sc.next();
            if (sc1.equals("exit")) {
                break;
            }


        }
    }
}



