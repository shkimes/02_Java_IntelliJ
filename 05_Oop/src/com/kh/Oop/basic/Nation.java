package com.kh.Oop.basic;
/*
* 클래스 :  객체가 가져야 할 속성(값), 기능(메서드)를 클(코드)로 작성해둔 문서(설계도)
*            == 객체를 정의한것
* */

// 국민(Nation) 객체를 만들기 위한 클래스
public class Nation {

    String name; // 이름
    int age; // 나이
    char gender; // 성별
    String juminNumber; // 주민번호
    String tel; // 전화번호
    String address; // 주소


    /*
    * 기능 메서드 행동
    *
    * */

    public void speak(){
        System.out.println("가나다라 한국어 가능합니다");
    }
    public void 납세의의무(){
        if(age>=19){
            System.out.println(name + "님은 세금 납부 대상자 입니다");
        }else {
            System.out.println(name + "님은" +age+"세 미성년자로 납부 대상자가 아닙니다");
        }

    }
}
