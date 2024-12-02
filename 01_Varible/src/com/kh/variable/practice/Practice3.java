package com.kh.variable.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 : ");
        int Num1 = sc.nextInt();
        System.out.println("두 번째 숫자 : ");
        int Num2 = sc.nextInt();

        System.out.println("덧셈 : "+(Num1+Num2));
        System.out.println("뺄셈 : "+(Num1-Num2));
        System.out.println("곱셈 : "+(Num1*Num2));
        System.out.println("나누기 : "+(Num1/Num2));
    }
}
