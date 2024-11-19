package com.variable.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int 국어 = sc.nextInt();
        System.out.print("영어 : ");
        int 영어 = sc.nextInt();
        System.out.print("수학 : ");
        int 수학 = sc.nextInt();
        System.out.println("총점 : " +(국어+영어+수학));
        System.out.print("평균 : "+(국어+영어+수학)/3);




    }
}
