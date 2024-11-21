package com.kh.Oop.methodPre;

public class VoidPre {
    // 메서드1: 온도변화 확인하기
    public void method1(double celsius){

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨는"+celsius+"도, 화씨는"+fahrenheit+"도 입니다");

    }
    public void method2(String name){
        System.out.println("학생이름 : "+name);

    }
    public void method3(String goods ,double price){
        System.out.println("상품명 : "+goods+", 가격: "+price+"원");
    }
    public void method4(int hours){
        System.out.println("총"+hours+"분 입니다");
    }
    public void method5(String exercise, int duration){
        System.out.println("운동: "+exercise+", 지속시간 : "+duration+"분");
    }
    public void method6(String accountNumber, double balance){
        System.out.println("계좌번호"+accountNumber+", 잔액: "+balance+"원");
    }
    public void method7(String title,String rating){
        System.out.println("영화 제목: "+title+", 평점 : "+rating);
    }
    public void method8(String itemName, int TopSpeed){
        System.out.println("차량명 : "+itemName+", 최고속도 : "+TopSpeed+"km/h");
    }
    public void method9(String recipient, String subject){
        System.out.println("수신자 : "+recipient+", 제목 : "+subject);
    }
    public void method10(String itemName, int quantity){
        System.out.println("상품명 : "+itemName+", 수량 : "+quantity+"개");
    }


}
