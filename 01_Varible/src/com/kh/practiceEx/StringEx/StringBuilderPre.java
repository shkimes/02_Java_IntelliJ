package com.kh.practiceEx.StringEx;

public class StringBuilderPre {
    public void mehtod1(){
        // 1. 작성된 객체를 StringBuilder sb로 변환해서 사용
        StringBuilder str = new StringBuilder("Welcome");

        // 2. to Java 이어서 작성
        str.append("to Java");
        System.out.println("2."+str);

        // 3. 8번째 자리에 the world of 글자 추가
        str.insert(8,"the world of");
        System.out.println("3."+str);

        // 4. 4~11 come to 변경
        str.replace(4,11,"come to");
        System.out.println("4."+str);

        // 5. 20, 25 삭제
        str.delete(5,20);
        System.out.println("5."+str);

        // 6. sb 뒤집기
        str.reverse();
        System.out.println("6."+str);


    }
}
