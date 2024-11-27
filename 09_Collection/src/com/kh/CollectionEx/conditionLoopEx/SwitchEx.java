package com.kh.CollectionEx.conditionLoopEx;

public class SwitchEx {

    /*
    switch 하나의 변수나 값을 여러 케이스로 나눠 조건에 따라 조건에서 원하는 기능을 실행
        switch (변수/값)
    * */

    public static void main(String[] args) {
        int asd = 1; // 수위치 안에 asd라는  값이 들어왔을 때 asd에 해당하는 조건 선택하고 기능실행
        switch (asd) {
            case 1:
                System.out.println("1");
                break;
                case 2:
                    System.out.println("2");
                    break;
                    default:
                        System.out.println("1과 2가 모두 아닐 때 실행");
                        break;
        }
    }



}
