package com.kh.pratice.condition;

import java.util.Scanner;

public class Practice1 {
    Scanner sc = new Scanner(System.in);
    public void method1() {

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
                result = "입력메뉴입니다";
                break;
            case 2:
                result = "수정메뉴입니다";
                break;
            case 3:
                result = "조회메뉴입니다";
                break;
            case 4:
                result = "삭제메뉴입니다";
                break;
            case 5:
                result = "프로그램을 종료합니다";
                break;
            default:
                result = "올바른 입력번호를 눌러주세요";
                break;

        }
        System.out.println(result);


    }

    public void method2() {


        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수입니다");
            } else {
                System.out.println("홀수입니다");
            }
        } else {
            System.out.println("양수가 아닙니다");
        }
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String pw = sc.nextLine();

        if (id.equals("myId") && pw.equals("myPw")) {
            System.out.println("로그인 성공!");
        } else if (!id.equals("myId") && pw.equals("myPw")) {
            System.out.println("아이디가 틀렸습니다");
        } else if (!pw.equals("myPw") && id.equals("myId")) {
            System.out.println("비밀번호가 틀렸습니다");

        } else {
            System.out.println("아이디와 비밀번호를 다시 입력해주십시오");
        }
    }
    /*

    == 부등호
        if (saveId == inputId && savePw == inputPw) {// 1. 아이디와 비밀번호가 같다면 로그인 성공!
            System.out.println("로그인성공");
        } else if (saveId != inputId) {// 2. 아이디가 틀렸다면 아이디가 틀렸습니다.
            System.out.println("아이디가 틀렸습니다.");
        } else  if (savePw != inputPw) {
            System.out.println("비밀번호가 틀렸습니다."); // 3. 비밀번호가 틀렸다면 비밀번호가 틀렸습니다.
        } else {
            System.out.println("아이디와 비밀번호가 틀렸습니다.");
        }
*/


    /*
     * if문으로 되어있는 봄, 여름, 가을, 겨울을 switch문으로 바꿔서 출력해라
     *
     * */
    public void method4() {
        //1 ~ 12 사이의 정수 입력받기
        System.out.print("1 ~ 12 사이의 정수 입력 : ");
        int month = sc.nextInt(); //사용자가 입력한 월 가져오기

        // switch 문을 이용해서 계절 출력
        switch (month) {
            // 겨울
            case 1:
            case 2:
            case 12:
                System.out.println(month + "월은 겨울입니다.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(month + "월은 봄입니다.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(month + "월은 여름입니다.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(month + "월은 가을입니다.");
                break;
            default:
                System.out.println(month + "월은 잘못 입력된 달입니다.");
        }
    }

    /*
    메서드 명 : public void practice6(){}
    사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
    단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
    회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
    비회원은 게시글 조회만 가능합니다.
    */
    public void method6() {
        System.out.print("사용자 권한을 입력하세요.(관리자, 회원, 비회원) : ");
        String role = sc.next();
        if ("관리자".equals(role)) {
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
        } else if ("회원".equals(role)) {
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
        } else if ("비회원".equals(role)) {
            System.out.println("게시글 조회만 가능합니다.");

        } else {
            System.out.println("잘못된 권한입니다.");
        }


    }


}


