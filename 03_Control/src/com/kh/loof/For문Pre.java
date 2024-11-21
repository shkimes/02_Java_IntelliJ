package com.kh.loof;

import java.util.Scanner;

public class For문Pre {
    Scanner sc = new Scanner(System.in);

    public void method1(){
    String[] fruits = {"사과","바나나","체리"};
    // 주의할 점 : 값이 들어있는 배열과 값을 하나씩 꺼내서 저장하는 변수명은 자료형이 일치해야한다
        // fruit 는 String 인데, 과일을 하나씩 담는 변수명 fruits가 int일경우 "사과"와 같은 문자열을 담을 수 없기때문에
        // fruits 는 String이어야함
    for(String fruit : fruits){
        System.out.println(fruit);
    }
    }
    public void method2(){
        int[] numbers = {1,2,3};
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
