package com.kh.Oop.constructor;

public class SnackRun {

    public static void main(String[] args) {
        Snack sn1 = new Snack();
        sn1.setName("초코칩쿠키");
        sn1.setPrice(1500);
        sn1.setTaste("달콤한 초코맛");
        Snack sn2 = new Snack();
        sn2.setName("허니버터칩");
        sn2.setPrice(2000);
        sn2.setTaste("달콤한 버터맛");
        Snack sn3 = new Snack();
        sn3.setName("새우깡");
        sn3.setPrice(1200);
        sn3.setTaste("짭짤한 새우맛");



        String result1 = sn1.toString();
        System.out.println(result1);
        String result2 = sn2.toString();
        System.out.println(result2);
        String result3 = sn3.toString();
        System.out.println(result3);

    }


}
