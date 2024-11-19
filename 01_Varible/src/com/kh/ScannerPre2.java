package com.kh;

import java.util.Scanner;

// 줄바꿈 단축키 Alt + Shift + ↑ or ↓

public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();//사용자가 키보드로 입력하는 이름를 입력받는 공간

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 사용자가 키보드로 입력하는 나이를 입력받는 공간

        System.out.print("취미를 입력하세요: ");
        String hobby = sc.next();//사용자가 키보드로 입력하는 취미를 입력받는 공간

        System.out.println("====자기소개====");
        System.out.println("이름을 입력하세요: "+name);
        System.out.println("나이를 입력하세요: "+age);
        System.out.println("취미를 입력하세요: "+hobby);


        sc.close();





    }
}
