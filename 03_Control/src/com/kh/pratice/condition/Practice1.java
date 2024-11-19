package com.kh.pratice.condition;

import java.util.Scanner;

public class Practice1 {
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====메뉴====");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴번호를 입력하시오");

        int choice = sc.nextInt();
        String result;
        switch (choice) {
            case 1:
                result="입력메뉴입니다";
                break;
            case 2:
                result="수정메뉴입니다";
                break;
            case 3:
                result="조회메뉴입니다";
                break;
            case 4:
                result="삭제메뉴입니다";
                break;
            case 5:
                result="프로그램을 종료합니다";
                break;
            default:
                result ="올바른 입력번호를 눌러주세요";
                break;

        }
            System.out.println(result);


    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수입니다");
            } else {
                System.out.println("홀수입니다");
            }
        }else {
            System.out.println("양수가 아닙니다");
        }
    }
    public void method3() {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String pw = sc.nextLine();

        if (id.equals("myId") && pw.equals("myPw")) {
            System.out.println("로그인 성공!");
        }else if(!id.equals("myId")&&pw.equals("myPw")) {
            System.out.println("아이디가 틀렸습니다");
        } else if (!pw.equals("myPw")&&id.equals("myId")) {
            System.out.println("비밀번호가 틀렸습니다");

        }else {
            System.out.println("아이디와 비밀번호를 다시 입력해주십시오");
        }
    }

}
