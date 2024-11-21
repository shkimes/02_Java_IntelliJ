package com.kh.Oop.methodEx;

public class Return메서드실행 {
    public static void main(String[] args) {


        /*
        * return은 값을 가지고 있는 기능일뿐 출력기능이 아님!
        * return 메서드는 값을 전달하는 메서드.
        * 출력해서 보여주는 메서드가 아니다
        * return으로 전달받은 값을 알길 원한다면 System.out.print();소괄호 안에 r.method1를 넣어줘야함
        * ex. System.out.println(r.method1())
        *
        * */
        Return메서드 r = new Return메서드();
        System.out.println(r.method1());
        System.out.println(r.method2(3));
    }
}
