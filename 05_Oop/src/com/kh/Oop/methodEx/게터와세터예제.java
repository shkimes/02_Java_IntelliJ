package com.kh.Oop.methodEx;

public class 게터와세터예제 {

    //private 멤버 변수
    private int age; // 나이를 받는 변수명

    //게터 세터 단축키 alt + insert

// 게터 = 저장된 값 전달해서 사용 =  추후 @Getter 라는 이름으로 요약
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        /*
        * setter 에다가 값을 저장할 때 유효성 검사와 같은 if문 넣지않음
        * //간단하게 유효성 검사
        * if (age<=0{
        * System.out.println ("나이는 음수가 들어갈 수 없습니다")
        * }
        *
        * */




        this.age = age;

    }




}
