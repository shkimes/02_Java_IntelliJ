package com.kh.Oop.methodPre;

public class VoidPreRun {
    public static void main(String[] args) {
        VoidPre vo = new VoidPre();
        System.out.println("=====기능1 : 온도변환기=====");
        vo.method1(25);

        System.out.println("=====기능2 : 학생 이름 출력=====");
        vo.method2("홍길동");

        System.out.println("=====기능3 : 상품 가격 표시=====");
        vo.method3("노트북", 1500000);

        System.out.println("=====기능4 : 시간 계산=====");
        vo.method4(150);
        System.out.println("=====기능5 : 운동기록 출력=====");
        vo.method5("달리기", 45);
        System.out.println("=====기능6 : 계좌 잔액 출력=====");
        vo.method6("123-456-789", 100000.50);
        System.out.println("=====기능7 : 영화 정보 출력=====");
        vo.method7("인터스텔라", "9.5/10");
        System.out.println("=====기능8 : 차량 정보 출력=====");
        vo.method8("스포츠카", 300);
        System.out.println("=====기능9 : 이메일 전송 로그=====");
        vo.method9("example.kht.com", "안녕하세요!");
        System.out.println("=====기능10 : 쇼핑카트 아이템 출력=====");
        vo.method10("휴대폰 케이스", 2);


    }
}
