package com.kh.Oop.field.PrivatePack;

public class PrivateExRun {

    //private 필드 선언
    private String 계좌번호;
    private String 계좌잔액;

    //private 으로 생성한 변수명을 사용하기 위해서는 getter setter 를 사용해야함
    // getter : 값 저장하기
    // setter : 저장된 값 불러와서 사용하기
    // 단축키 Alt + insert


    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public String get계좌잔액() {
        return 계좌잔액;
    }

    public void set계좌잔액(String 계좌잔액) {
        this.계좌잔액 = 계좌잔액;
    }
}
