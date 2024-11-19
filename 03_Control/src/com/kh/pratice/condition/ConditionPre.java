package com.kh.pratice.condition;

import java.util.Scanner;

public class ConditionPre {
    public void methodAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        String Age = "";
        switch (age) {
            case 1:
                if (age <= 13) {
                    Age = "어린이";
                } else if (age >= 14 && age < 19) {


                    Age = "청소년";
                } else {
                    Age = "성인";
                }
                break;

        }
        System.out.println(age + "는" + Age + "입니다");


    }
}
