package com.kh.loof;

import java.util.Scanner;

public class For문 {
    Scanner sc = new Scanner(System.in);
    //일반적이고 1차원적인 for문
    public void method1(){

        /*
        *  Java, JavaScript 모두 사용방법은 동일
        * for 문은 반복문을 작성할 때 사용하는 가장 기본적인방법
        * 일정한 횟수 만큼 코드를 반복 실행하고 싶을 때 사용
        *
        * for (초기식;조건식;증감식){
        *   // 조건식이 true일 경우 실행될 코드
        *  // 조건식이 false 가 될때까지 반복 실행
        * }
        * 초기식 : 자료형 변수명 = 시작할 숫자
        *           초기식에 들어갈 변수명은 i,asd, abc 등 개발자가 원하는 변수명을 작성
        *           초기식에 평균적으로 int 에다가 i 를 부여하는 이유는 i 가 index 의 약자이기 때문이다.
        *           값을 0으로 지정하는 이유는,
        *           배열이나 리스트에서 인덱스(index)값이 0으로 시작하기 때문에 int i =0; 으로 초기값을 작성하게 되었다.
        * 조건식 : {} 를 언제까지 실행할 것인지에 대한 조건
        * 증감식 : 증가하거나 감소하는 값을 일정하게 저장
        *           ++ : 조건식에서 작성한 변수명에 +1
        *           -- : 조건식에서 작성한 변수명에 -1
        * */

        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }




    }
    //일반적이고 2차원직인 for문
    public void method2(){
        /*
        * 중첩된 반복문 (nested loof)
        * - 하나의 반복문 내부에 또 다른 반복문을 포함하는 구조.
        * - 2차원 데이터 처리나 중첩된 작업을 진행할 때 사용
        * ex. 구구단
        *
        * for(초기식1; 조건식1; 증감식1;){ // 외부반복문 = 조건식1이 true 일 때 반복될 코드
        *   for (초기식2; 조건식2; 증감식2; { // 내부반복문 = 조건식2가 true 일 때 반복 실행될 코드
        *   }
        * }
        *
        * 2차원 데이터나 조합 계산이 필요할 때 이중 for 사용
        * 그러나 컴퓨터 성능 문제를 고려하여 대체 방법이 가능할 경우 사용을 최소화 하는 것이 좋음
        * */
        for (int i = 0; i < 10; i++ ){
            for (int j = 0; j < 10; j++ ){
                System.out.println("i값="+i);
                System.out.println("j값="+j);
            }
        }



    }
    //for 문을 이용한 구구단 출력하기
    public void method3(){
        for (int i = 2; i < 10; i++ ){ // 구구단은 2단부터 시작하기 때문에 초기값을 2로 시작
            for (int j = 1; j < 10; j++ ){ // 구구단은 단 옆에 반복할 수를 1부터 시작하기 때문에 초기식을 1부터 시작
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println(); // 한 칸 줄바꿈해서 단이 변경될 때마다 한줄 공백 처리
        }
    }
    //향상된 for문
    public void method4(){
        /*
        * 향상된 for 문
        * 자바 5 버전에서부터 도입된 반복문 ** 지금 현재 쓰는 버전은 11버전
        * 배열이나 컬렉션과 같은 데이터 집합을 다룰 때 사용
        * 기존의 for문 보다 간결하고, 반복문에서 index 처리가 필요하지 않을 때 사용
        *
        * for (타입 변수명 : 컬렉션이나 배열){
        *   //변수명은 각 요소를 나타냄
        * }
        * ** 요소 : html 에서는 <태그>내용물</태그>
        *           Java 에서는 배열이나 컬렉션 또는 기타 데이터 구조 안에 저장된 개별 데이터
        *           ex. int[] numbers = {10, 20, 30, 40};
        *               number 의 배열의 요소 : 10,20,30,40;
        *
        *           for(int 변수명 : num){
        *               System.out.println("요소 : "+변수명)
        * }
        * */
        int[] num = {10, 20 ,30 ,40};
        // num에 들어있는 10부터 20 30 40이 차례대로 num라는 변수 안에 값이 들어가지고 하나씩 출력
        // num에 들어 있는 값들을 처음부터 하나씩 모드 전달
        for (int number : num){
            System.out.println("num"+number);
        }
    }
}
