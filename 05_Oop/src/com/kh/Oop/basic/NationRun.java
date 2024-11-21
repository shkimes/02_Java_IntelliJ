package com.kh.Oop.basic;

public class NationRun {
    public static void main(String[] args) {

    /*
Nation(국민) 객체생성
Nation 클래스의 내용대로 HRAP영역에 할당하는것
*/

    //각각의 국민들의 정보를 받고 조회할 것
Nation n = new Nation();
    String name1="신짱구"; // 이름
    int age1=18; // 나이
    char gender1='M' ;// 성별

    n.name="홍길동" ;// String name2= "홍길동";// 이름
    n.age=5; //int age2= 5;// 나이
    n.gender = 'F'; //char gender2='F'; // 성별

    //System.out.print("이름은 %s 이고 %d세이며, %c성 입니다\n",name, age, gender);
}
}