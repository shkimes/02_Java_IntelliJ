package com.kh.oopEx;

public class OopRun {

    // 만약 Nation 에 접근 제한자나 static 을 붙이길 원한다면 main() 메서드 바깥에 작성해야함

    public Nation n1 = new Nation();
    public static Nation n2 = new Nation();


    public static void main(String[] args) {
        // {} 안에 있기 때문에 지역변수로 접근 제한자를 앞에 붙이지 못함
        // static main() 메서드 안에 있기 때문에 static 사용 불가
        // 접근 제한자 사용불가

        Nation n = new Nation();
        Student s = new Student();
    }
}
