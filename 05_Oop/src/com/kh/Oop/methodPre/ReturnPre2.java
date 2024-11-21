
package com.kh.Oop.methodPre;

public class ReturnPre2 {
  public String name = "홍길동";
  public int age = 40;

    public String method1() {

        return "안녕하세요" + "제 이름은" + name + "이고, 나이는" + age + "세 입니다.";
    }
    public String method2(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 > num2");
        }else{
            System.out.println("num1 < num2");
        }
     return "";
    }
    public String method3(char a) {

        if (a == 'A') {
            System.out.println('A');
        }else if (a == 'B') {
            System.out.println("B");
        }else if (a == 'C') {
            System.out.println("C");
        }else if (a == 'D') {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        return "";
    }


}
