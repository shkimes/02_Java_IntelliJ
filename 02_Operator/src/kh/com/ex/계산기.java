package kh.com.ex;

import  java.util.Scanner;

public class 계산기 {
    public void 더하기기능() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int n2 = sc.nextInt();
        System.out.println("합계 : "+(n1+n2));
        }
        public void 빼기기능(){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 숫자 : ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            int n2 = sc.nextInt();
        System.out.println("합계 : "+(n1-n2));
    }
}
