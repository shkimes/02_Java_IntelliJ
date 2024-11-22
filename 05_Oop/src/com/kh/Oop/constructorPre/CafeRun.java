package com.kh.Oop.constructorPre;

import java.util.Scanner;

public class CafeRun {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe();
        System.out.println("메뉴이름을 작성해주세요");
        String name = sc.nextLine();
        System.out.println("메뉴가격을 작성해주세요");
        int price = sc.nextInt();
        System.out.println("메뉴를 주문할 수량을 작성해주세요");
        int quantity = sc.nextInt();

    Cafe cafe1 = new Cafe(name ,price, quantity);


    }
}
