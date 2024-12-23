package com.kh.conditionEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    /*
    Entry<Key, value>
    키-값 쌍으로 데이터를 저장하는 구조
    키는 중복을 허용하지 않지만 값은 중복을 허용
    키 = key     값 = value
    대표적인 클래스 HashMap, LinkedHashMap, TreeMap

    특징
    키는 중복 허용하지 않음 : 동일한 키로 여러 번 데이터를 저장하면, 기존의 값이 새로운 값으로 덮어씌워짐
    값은 중복을 허용 : 동일한 값은 다른 키에 여러번 저장될 수 있음
    순서 : HashMap 순서를 보장하지 않지만
           LinkedHashMap 입력 순서 유지
           TreeMap 키의 자연 순서 or 지정된 순서로 정렬

    메서드
    put(K key, V value) : 지정한 키에 해당하는 값을 저장
    get(Object key) : 지정한 키에 해당하는 값을 반환
    remove(Object key) : 지정한 키에 해당하는 요소(=값) 삭제
    containsKey(Object key) : 지정한 키가 존재하는지 확인
    containsValue(Object value) : 지정한 값이 존재하는지 확인
    size() : Map에 저장된 요소(=값)의 개수를 반환
    clear() : 모든 요소(=값) 삭제
    keySet() : 저장된 모든 키를 Set으로 반환
    values() : 저장된 모든 값을 Collection으로 반환
    entrySet() : 저장된 모든 엔트리(키-쌍)을 set으로 반환

    사용법
        Map<String, String> 변수이름 = new HashMap<String, String>();
    HashMap<String, String> 변수이름 = new HashMap<String, String>();

    키가 숫자이고, 값이 String 일 때
    HashMap<Integer, String> 변수이름 = new HashMap<Integer, String>();
    key가 String이고, value가 int(=Integer)일 때
    HashMap<String, Integer> 변수이름 = new HashMap<String, Integer>();
    */

    public static void main(String[] args) {
        //HashMap 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //사과 1000 바나나 2000 포도 3000 추가
        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("포도", 3000);

        //사과가 얼마인지 System 출력문 이용해서 확인
        System.out.println("사과 가격 : " + map.get("사과"));

        //물가가 올랐습니다. 사과를 1500으로 변경
        map.put("사과", 1500);
        System.out.println("물가 적용된 사과 가격 : " + map.get("사과"));

        //바나나를 판매합니까? System 출력문을 이용해서 확인 Yes or No
        // 정답
        String hasBanana = (map.containsKey("바나나")) ? "Yes" : "No";
        System.out.println("바나나 판매중인가요? : " + hasBanana);
        // 풀이
        if (map.containsKey("바나나")) {
            System.out.println("바나나 판매 여부 : Yes");
        } else {
            System.out.println("바나나 판매 여부 : No");
        }

        //3000원 짜리 과일이 존재합니까? System 출력문 이용해서 확인 Yes or NO
        //정답
        String has3000Value = map.containsValue(3000) ? "Yes" : "No";
        System.out.println("3000원 짜리 과일이 존재합니까? : " + has3000Value);

        //풀이
        if (map.containsValue(3000)) {
            System.out.println("3000원 짜리 과일 존재 여부 : Yes");
        } else {
            System.out.println("3000원 짜리 과일 존재 여부 : No");
        }

        //바나나 품절됐습니다. 바나나 데이터 삭제
        map.remove("바나나");
        System.out.println("바나나가 품절 됐습니다.");

        //과일의 개수는? System 출력문을 이용해 확인
        System.out.println("현재 과일의 개수 : " + map.size());

        //모든 키 출력
        System.out.println("모든 과일 : "+ map.keySet());

        //모든 값 출력
        System.out.println("모든 가격 : " + map.values());

        //모든 키와 값 출력
        System.out.println("모든 키와 값 : " + map.entrySet());
    }
}