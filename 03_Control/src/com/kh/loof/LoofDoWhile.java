package com.kh.loof;

import java.util.Scanner;

public class LoofDoWhile {
    Scanner sc = new Scanner(System.in);
    /*
    * do-while 문
    * -조건식이 뒤에 작성된 while문을 무조건 최소 1회이상의 반복을 보장함
    * */
    /*
    * 기능(method, 메소드)
    * method1() 기능은 do-while을 이용해서 0이 입력될 때까지 정수를 계속 입력 받고 0입력시 누적된 합계를 출력
    * */

    public void method1(){
        int sum =0; // 합계 누적용 변수
        int input = 0; // 입력한 값을 저장하는 변수

        do { //while문을 시작하기 전에 한 번 무조건 실행하는 공간. 입력한 값이 0이 아닐때 반복함
            System.out.println("정수 입력 : ");
            input = sc.nextInt(); // 사용자가 키보들 입력한 정수 가져오기
            sum += input; // 입력한 수를 sum변수에 계속 더하기를 진행하는 것
                        //sum 누적된 값이 얼마나 되던간에 input으로 들어온 값이 0이면 종료
        }while (input != 0);
    }
}
