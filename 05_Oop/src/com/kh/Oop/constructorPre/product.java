package com.kh.Oop.constructorPre;
//-3_0_필드실습예제
public class product {
    //필드
    //-pName price band
    private String pName = "제품명";
    private int price = 1500;
    private String brand = "가나다라 맑은세상";
    //메서드기능들 ↓
    //기본생성자
    //+Product
    public product(){

    }
    // void 메서드
    //+information() : void
    public void information(){
        System.out.println("이름 :"+ pName);
        System.out.println("가격 :"+ price);
        System.out.println("브랜드 :"+ brand);
    }


}
