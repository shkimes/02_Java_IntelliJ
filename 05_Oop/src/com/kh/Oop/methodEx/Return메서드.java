package com.kh.Oop.methodEx;

public class Return메서드 {
    /*
        데이터 베이스에 저장되어있는 값을 프론트앤드에 전달할 때 주로 사용
        return 자바 메서드 (=기능) 에서 값을 반환하는데 사용
        메서드가 특정 작업을 수행한 후 결과를 호출자에게 전달하려면 return을 사용해야함
    * publoc 자료형 메서드명 (매개변수이름자리) {
    *              //기능작성
    *           return (생략 가능한 변수명 자리);
    * }
    *
    * */
    //1. 매개변수가 없는 return 메서드
    public String method1(){
        return "안녕";
    }
    //2. 매개변수가 있는 return 메서드
    public int method2(int asd){
        return asd;



        }
    }

