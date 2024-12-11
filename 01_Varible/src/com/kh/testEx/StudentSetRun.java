package com.kh.testEx;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetRun {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter student name: ");
            System.out.print("Enter student name: ");
            System.out.print("Enter student name: ");
            System.out.print("Enter student name: ");
            System.out.print("Enter student name: ");
            System.out.print("메뉴선택");

            int choice = sc.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("[1] 학생 추가");
                    System.out.print("추가할 학생 이름을 입력해주세요: ");
                    String studentName = sc.nextLine();
                    if (studentSet.add(studentName)){
                        System.out.println(studentName+"이(가) 추가되었습니다");
                    }else{
                        System.out.println(studentName+"은(는) 이미 존재하는 학생입니다.");
                    }
                    break;

                    case 2:

            }
        }
    }
}
