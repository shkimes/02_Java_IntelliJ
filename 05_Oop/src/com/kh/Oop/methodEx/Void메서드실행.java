package com.kh.Oop.methodEx;

import java.util.Scanner;

public class Void메서드실행 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Void메서드 v = new Void메서드();
        System.out.println("첫번째");
        v.method1();

        String userId = "홍길동";
        System.out.println("두번째");
        v.method2(userId);

        System.out.println("세번째");
        v.method3(40);


        //method4의 경우 String , int 순서대로 값을 넣어주겠다고 표기를 해놓았기 때문에
        //1번자리에넌String 와 같은 문자열이, 2번자리 int 와 같은 정수형이 들어가야한다.
        System.out.println("네 번째");
        String name = "신짱구";
        int age = 18;
        v.method4(name,age);

        System.out.println("다섯번째");
        v.결혼정보회사("오기달","안영식");

        System.out.println("여섯번째");
        String id = "shkimes";
        String pw = "shkim";
        v.iogin(id,pw);
    }
}
