package com.kh.loof;

public class LoofExRun {
    public static void main(String[] args) {

        LoofEx lo = new LoofEx();

        System.out.println("====method1====");
        lo.method1();
        // ↑ 위와같이 void 안에 써야함. 바깥에다가 쓰면 작동안함
        System.out.println("====method2====");
        lo.method2();
        System.out.println("====method3====");
        lo.method3();
        System.out.println("====method4====");
        lo.method4();


    }
}
