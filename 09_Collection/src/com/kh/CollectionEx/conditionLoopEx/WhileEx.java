package com.kh.CollectionEx.conditionLoopEx;

public class WhileEx {
    int asd = 1;
    boolean isTure = true;
/*
    public static void main(String[] args) {
        WhileEx Ex = new WhileEx();
        Ex.method1();
        Ex.method2();
    }


    public void method1() {
        while (isTrue) {
            switch (asd) {
                case 1:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("숫자를 잘못입력하였습니다. 프로그램을 종료합니다");
                    isTrue = false;
            }
        }
*/

        public void method2(){
            while (true) {
                int a = 1;
                switch (a) {
                    case 1:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("숫자를 잘못입려하였습니다. 프로그램을 종료합니다");
                        break;
                }
            }


        }
    }


    /*
     while은 조건이 참(true)인 동안 특정 코드 블록을 반복적으로 실행하는 제어구문

     while(조건이 true 일 때){
        반복 실행될 코드
        }

        반복 횟수가 명확하지 않을 때 사용
        while(false)라면 내부 코드는 한 번도 실행되지 않기 때문에 문제가 발생한다
        while(true)로 반드시 설정

        while문을 종료하는 방법은 ()안을 false로 만들거나 return 처리를 하는 방법

        1. while 문을 false 로 만들기
        boollean isTrue = true
        while(isTure) {

                if (조건1) {
                    조건이 1일 때 실행될 코드
                    }else{
                    조건이 1이 아닐때 실행될 코드
                    isTrue = false 로 변경해서 while문을 종료시킴
                    }
                    }


        2. return 처리
        while(true){

            if (조건1){
                조건1이 true 일 때 실행될 코드
                }else{
                조건1이 아닐 때 실행될 코드
                return; 사용해서 위 모든 기능을 while 포함해서종료
                }
                ]

    * */


