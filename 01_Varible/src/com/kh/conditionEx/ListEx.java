package com.kh.conditionEx;

public class ListEx {

    /*
    * 순차저긍로 요소들을 저장하는 자료구조
    * 리스트는 인터페이스로 정의
    * 초기에는 Vector 를 사용했지만 메모리 사용과 시간소모가 많아 아래 클래스를 출시
    *
    * 대표적인 클래스 : ArrayList(조회 빠름), LinkedList(삽입, 삭제 빠름)
    *
    * 특징
    * 순서 존재 : 저장된 요소 (값)들은 인덱스를 통해 0번 부터 저장되고, 순차저긍로 접근가능
    * 중복 허용 : 동일한 요소 (값)을 여러 번 저장할 수 있음
    * 동적 크기 : 배열과 달리, 리스트는 크기가 (유)동적으로 변결될 수 있음
    * null 허용 : null 값을 요소(값)으로 저장할 수 있음
    *
    * 주요 메서드 (기능)
    * add (E e)         : 리스트 끝에 요소(element = 값)을 추가
    * get (int index)   : 주어진 인덱스의 요소(값)을 반환
    * remove (int index): 주어진 인덱스 요소(값)을 삭제
    * remove (E e)      : 주어진 요소(값)을 삭제
    * size()            : 리스트 크기(요소 = 값 의 개수) 를 반환
    * clear()           : 리스트의 모든 요소(값) 삭제
    *
    * 사용법
    *
    *   // List 계열인 ArrayList 나 LinkedList 사용 가능
    *       List<> 변수이름 = new ArrayList<>();
    *       List<> 변수이름 = new LinkedList<>();
    *
    *   // 구체적으로 List 계열중에서 ArrayList 사용가능
    * ArrayList<> 변수이름 = new ArrayList<>();
    *   // 구체적으로 List 계열중에서 LinkedList 사용가능
    * LinkedList<> 변수이름 = new LinkedList<>();
    *
    * String 자료형만 저장 가능한 변수 이름
    * ArrayList<String> 변수 이름 = new ArrayList<String>();
    *
    *
    *
    *
    *
    * */
}