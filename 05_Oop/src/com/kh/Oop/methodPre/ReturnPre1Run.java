package com.kh.Oop.methodPre;

public class ReturnPre1Run {
    public static void main(String[] args) {
        ReturnPre1 r1 = new ReturnPre1();
        System.out.println(r1.findId("감길식",5678 ));
        System.out.println(r1.findId("홍길동",1234 ));


        int x = 1;
        int y = 2;
        System.out.println(r1. add(x,y));
        System.out.println(r1. sub(x,y));
        System.out.println(r1. mul(x,y));
        System.out.println(r1. div(y,x));

    }
}