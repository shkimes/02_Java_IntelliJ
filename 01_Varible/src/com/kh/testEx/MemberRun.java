package com.kh.testEx;

public class MemberRun {
    public static void main(String[] args) {
        Member mr = new Member();

        mr.setId("user1");
        mr.setName("강길자");
        mr.setPassword("pass1");

        if(mr.login("user1","pass1")){
            System.out.println("로그인 성공!"+mr.getName()+"님! 환영합니다");
        }else{
            System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요");
        }





    }
}
