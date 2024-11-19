package com.kh;

import java.util.Scanner;

public class ScannerPre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키보드로 문자 하나를 입력받아 문자의 유니코드를 출력하여라

        //char 값으로 next 를 입력받아서 변환

        System.out.print("문자를 입력하세요");
       // String text = sc.nextLine(); -> 여러 문자들을 가져오는 방법
       // System.out.println("text로 입력받은 문자  : " +text);

        // 문자 한 글자만 가져오는 방법. (기준 :  맨 첫글자만 가지고 온다)
        char ch = sc.next().charAt(0); // index 기준으로 맨 앞은 0번
        // 만약에 작성되지 않은 위치의 index 번호를 출력하려하면 출력하고자 하는 위치값에 존재하는 값이 없다는 에러문구가 뜬다


        // 문자  -> 숫자형식으로 변환하는 방법
        int changeNum = (int)ch;

        System.out.println("1번 ch 변수값 확인하기 :" + ch);
        System.out.println("2번 changeNum 변수값 확인하기 :" + changeNum);
        //ctrl + d 셀렉트 복사
        System.out.print("숫자 1번 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2번 : ");
        int num2 = sc.nextInt();

        System.out.println("숫자 합 : " + (num1+num2));

    }
}
