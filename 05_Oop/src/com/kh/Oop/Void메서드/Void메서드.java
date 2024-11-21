package com.kh.Oop.Void메서드;

import java.util.Scanner;

public class Void메서드 {
    Scanner sc = new Scanner(System.in);
    // 1. 매개변수 없이 전달할 이유도 없이 기능을 실행하는 역할
    public void method1(){
        System.out.println("안녕하세요");

    }
    // 2. 매개변수가 존재하는 void 메서드
    /*
    * 매개변수명은 지역변수로 오직 메서드 내부에서 자료형을 전달하는 변수명의 역할을 주로하기때문에 userId가 아니라
    * asd 라는 이름을 넣어도 되고 어떤 이름을 넣든 문제 x
    *
    * public void 기능명(변수종류 값이들어올공간){
        System.out.println("안녕하세요"+들어온 값+"님!");
        }

    * */
    public void method2(String userId){
        System.out.println("안녕하세요"+userId+"님!");
    }
    public void method3(int age){
        System.out.println(age+"세 입니다");
    }
    public void method4(String name, int age){
        System.out.println(name+"님의 나이는"+age+"세 이군요!");
    }

    public void 결혼정보회사(String  상대1번, String 상대2번){
        System.out.println(상대1번 + "과의 소개팅을 시작합니다");
        System.out.println(상대2번 + "과의 소개팅을 시작합니다");
    }
    public void iogin(String  id, String pw){
        System.out.println(id);
        System.out.println(pw);
    }

}
