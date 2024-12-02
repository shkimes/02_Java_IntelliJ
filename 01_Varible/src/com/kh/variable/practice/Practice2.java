package com.kh.variable.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double 국어 = sc.nextInt();
        System.out.print("영어 : ");
        double 영어 = sc.nextInt();
        System.out.print("수학 : ");
        double 수학 = sc.nextInt();
        //System.out.println("총점 : " +(국어+영어+수학));
        //System.out.print("평균 : "+(국어+영어+수학)/3);
        int 총점 = (int) (국어+영어+수학);
        int 평균 = 총점 /3;
        System.out.println("==성적결과==");
        System.out.println("총점 : "+총점);
        System.out.println("평균 : "+평균);




    }
}
