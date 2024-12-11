package com.kh.testEx;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManager {
    public static void main(String[] args) {
        // 학생 이름과 점수를 저장할 Map 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 데이터입력(학생 정보 저장)
        map.put("김철수", 85);
        map.put("이영희", 92);
        map.put("박민수", 77);
        map.put("최수진", 88);

        // 데이터 출력
        System.out.println("학생정보 출력");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()+"학생정보출력");
        }


        System.out.println("합격/불합격판단");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = (entry.getKey()>=80)?"합격" :"불합격";
            System.out.println(key + " : " + entry.getValue());
        }

        String updateName = "박민수";
        if(map.containsKey(updateName)) {
            map.put(updateName,82);
            System.out.println(updateName+"의 점수를 82점으로 수정합니다");

        }else{
            System.out.println("존재하지 않는 학생입니다");
        }

        System.out.println("점수 수정 후 합격/불합격 판단:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String status = (entry.getValue()>=80); ? "합격":"불합격";
            System.out.println(status + " : " + entry.getValue());
        }



        // 학생 점수로 합격 불합격 판단여부
        //

        public void printPassFailStudentScores(Map<String,Integer>map){
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                String status = (entry.getValue()>=80)? "함격":"불합격";
                System.out.println(entry.getKey()+" : "+status + " : " + entry.getValue());
            }
        }


    }




}
