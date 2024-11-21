
package com.kh.Oop.methodPre;

public class ReturnPre1 {
    public String name = "홍길동";
    public int phone = 1234;
    public String id = "doogdoog1004";


    public String findId(String a, int b){

        if(name.equals(a)){ // 참조형이라서 == 이 아니라 equal 로 판명해야함. 숫자로 입력하는 기본형은 ==
        return id;

        }else{
            return "아이디를 찾을 수 없습니다";
        }

    }
    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double mul(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }


}
