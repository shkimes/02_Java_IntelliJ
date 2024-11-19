package com.kh.condition;

public class ConditionExRun {
    // main 기능으로 ConditionEx에 작성한 기능 불러오기를 한 다음에 실행하기에 ConditionEx에 기능들이 실행됨
    public static void main(String[]args){
        ConditionEx c = new ConditionEx();

        c.나이확인();
        c.scannerAge();
        c.methodMonth();
    }
}
