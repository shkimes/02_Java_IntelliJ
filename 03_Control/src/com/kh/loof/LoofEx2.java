package com.kh.loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    public void while1() {
        /*while
        * 반복문의 한 종류
        * 특정 조건이 true인 동안 계속해서 코드를 진행하며
        * 특정 조건이 false인 경우 반복을 종료한다
        * while(조건식){
         조건식이 true일 때 실행되는 코드
         }
        * */
        //while1 기능은 i값이 6이 되면 false가 되는 기능

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }

    //while2 기능은 asd 값이 false가 되면 종료
    public void while2() {
        boolean asd = true; // 초기 asd 값은 true
        while (asd) {
            System.out.println("현재값 asd : " + asd);
            System.out.print("asd의 값을 false로 변경하려면 'no'를 입력하세요");
            String input = sc.nextLine();
            // equalsIgnoreCase : 대소문자를 구분하지 않고 문자열을 비교하는 기능
            //if (input.equalsIgnoreCase("no")) {}


            if (input.equalsIgnoreCase("no")) {//input으로 입력한 값이 no와 일치하다면 ==대신
                asd = false; //asd값을 false 변경
            }
        }
    }

    //while3 기능은 asd의 값이 0이 되면 종료
    public void while3() {
        System.out.println("====0되면 멸망하는 세상====");
        int asd = -1; //초기값을 0이 아닌 아무숫자로 설정
        while (asd == 0) {
            System.out.println(asd);


        }
    }

    //while4 기능은 asd값이 음수값이 되면 종료
    public void while4() {
        System.out.println("====음수가 되면 멸망하는 세상====");
        int asd = 5;
        while (asd < 0) {
            System.out.println(asd);
        }

    }

    public void while5() {
        System.out.println("===메뉴판===");
        System.out.println("1. 아메리카노 = 3000원");
        System.out.println("2. 라떼 = 4000원");
        System.out.println("3. 카푸치노 = 4500원");
        System.out.println("4. 주문종료");
        System.out.println("메뉴를 번호로 선택하세요");
        int drink = sc.nextInt();
        String Drink;
        int i = 0;
        boolean asd = true;
        while (asd) {
            switch (drink) {
                case 1:
                    Drink = "아메리카노를 선택하셨습니다";
                    i += 3000;
                    break;
                case 2:
                    Drink = "라떼를 선택하셨습니다";
                    i += 4000;
                    break;
                case 3:
                    Drink = "카푸치노를 선택하셨습니다";
                    i += 4500;
                    break;
                case 4:
                    Drink = "주문을 종료합니다";
                    asd = false;
                    break;
                default:
                    Drink = "잘못된 선택입니다";
                    break;

            }
            System.out.println(Drink);
            System.out.println("총 주문 금액:" +i+"원");

        }
    }
}
