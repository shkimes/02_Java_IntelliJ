package com.kh.operatorEx;

public class OperatorsPre {
    public static void main(String[] args) {
        System.out.println("전위 연산자");
        // 계산이 먼저 진행된 값을 사용
        int a=5;
        System.out.println(a);
        int result1 = ++a; // ++a 5+1을 완성한 a를 result1에 넣기
                System.out.println(a);
        System.out.println(result1);

        System.out.println("후위연산자");
        // 현재 값을 먼저 사용하고, 이후에 변수의 값이 증가 또는 감소
        int b=5;
        System.out.println(b);
        int result2 = b++; // 우선은 result2 에 b=5 값을 넣어주고 , b+1 을 진행
                System.out.println(b);
        System.out.println(result2);
    }
}
