
package com.kh.Oop.methodPre;

public class ReturnPre2 {
  public String name = "홍길동";
  public int age = 40;

    public String method1() {

        return "안녕하세요" + "제 이름은" + name + "이고, 나이는" + age + "세 입니다.";
    }
    public String method2(int num1, int num2) {
        if (num1 > num2) {
            return num2 + "보다"+ num1+"이 큰 숫자입니다"
;        }else{
            return num1 + "보다"+ num2+"이 큰 숫자입니다";
        }

    }
    public String method3(int a) {

        char grade;
        if (a >= 90) {
         grade = 'A';
        }else if (a >=80) {
        grade = 'B';
        }else if (a >=70) {
            grade = 'C';
        }else if (a >=60) {
         grade = 'D';
        }else{
            grade = 'F';
        }
        return "";
    }
    public  String method4(double a, double rate) {
        double total = a-(a*rate/100);
        return "원래가격"+a+"원 할인율 :" + rate+ "%최종금액 :"+total;
    }

    public String method6(int age) {
        // ( 조건식 ) ? true : false ;
        return "";
    }

}
