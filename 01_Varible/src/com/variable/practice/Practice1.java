package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요");
        char 문자 = sc.next().charAt(0);
        char unicode = (char) 문자;
        System.out.println("ex.");
        System.out.println("문자 : "+문자);
        System.out.println("A unocode : "+unicode);

    }
}
