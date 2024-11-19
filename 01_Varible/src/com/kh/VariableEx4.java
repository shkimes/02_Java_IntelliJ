// com.kh 폴더 안에 작성된 파일이라는 표기
package com.kh;

// VariableEx4 파일명으로 코딩을 class 내부에 작성하겠다는 표기
public class VariableEx4 {

    //메인 메서드 :  자바프로그램 실행용 기능
    public static void main(String[] args) {

        // 상수 : 한 번 값을 기록하면 값을 바꿀 수 없는 변수

        // 상수 키워드 : final 자바스크립트 const와 같음

        // 상수명 검색 :  모두 대문자로 작성, 연결되는 단어 사이에는 "_"로 구분한다
        // 상수명을 모두 대문자로 표기하는 것은 개발자간의 약속
        // 상수표기   자료형  변수명 = "변수값";
        // 변수명은 첫글자가 소문자;
        final       String NAME = "김서현";

        final int MIN = 0;
        final int MAX = 100;

        System.out.println("최소 :" + MIN);
        System.out.println("최대 : "+MAX);
    }
}
