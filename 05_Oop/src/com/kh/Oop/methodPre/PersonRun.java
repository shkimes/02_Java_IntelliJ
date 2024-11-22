package com.kh.Oop.methodPre;

public class PersonRun {
    public static void main(String[] args) {
        Person p = new Person();
        //Person 클래스에서 age 라는 변수명에 20이라는 숫자를 넣음

        int input = -40;
        p.setAge(20);
         if(input <= 0 ){
             System.out.println("나이는 음수일수 없다");
         }else {
             p.setAge(20);
         }

        //20이라는 숫자가 무사히 들어가져 있는지 확인
        p.getAge(); // set(20) 으로 넣은 20이라는 숫자를 가지고 있음
        // 출력하지 않아 우리 눈에 보이지 않음.


    }
}
