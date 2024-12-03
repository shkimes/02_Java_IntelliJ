package com.kh.arrayEx;

public class ArrayEx {

    /*
    * 배열(자료구조)
    *   Java에서의 배열
    *   -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
    *
    *   - 생성된 배열의 요소는 index를 이용해서 구분    (요소 = 값)
    *   - 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"를 이용
    *
    *   [참조형 변수]
    *   - 주소를 저장하는 변수
    *
    *   - 변수 사용 시 저장된 주소로 찾아가서 그곳에 위치한 배열, 객체 참조
    * ** 기본 자료형 8개를 제외한 나머지 자료형은 모두 참조형 변수
    *       기본 자료형 : byte short int long boolean float double char
    *
    *
    *
    * */

    public void method1() {
        // 변수 선언
        int num; // steak 영역에 int 자료형을 저장할 수 있는 변수 공간을 생성하고 그 공간의 이름을 mun으로 지정

        // 배열 선언
        int[] arr; // steak 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장) 그 변수의 이름을 arr로 저장

        // 배열 할당
        arr = new int[10]; // Heap 영역에 int 10개짜리 배열을 할당한 후 생성된 배열의 주소를 arr 변수에 대입
        // arr 이용해서 배열을 참조할 수 있음

        // 배열 초기화
        // 1) 초기화 전 -> 0이 대입되어 있는지 확인
        System.out.println("초기화 전");

        // 2) 인덱스를 이용한 초기화
        arr[0] = 100;
        arr[1] = 2000;
        arr[2] = 5;
        arr[3] = 8888;
        System.out.println("초기화 후");
        // 재 세팅했기에 초기화 후라고 지칭함

    }
        public void method2() {
            String str;

            String[] arr = new String[4];
            arr[0] = "java";
            arr[1] = "html";
            arr[2] = "css";
            arr[3] = "javaScript";
            // 01 _ 배열선언, 초기화 전 후 메모리 구조_String

            String arr2[] = {"java", "html", "css", "javaScript"};


        }

        /*
        * 배열 길이 확인 length 를 이용해 개수 확인
        * */
        public void method3(){
            int num[] = {1, 100, 1000};

            System.out.println(num.length);

            /*
            * 2차원 배열
            * int[][] arr = new int [1][2],
            *               // 2칸짜리 1차원 배열을 1개 묶은 배열
            * */


            }

            public void method4(){
            int arr[][] =new int[2][3];
                    arr[0][0] = 10;
                    arr[0][1] = 100;
                    arr[0][2] = 1000;
                    arr[1][0] = 20;
                    arr[1][2] = 200;
            }








}
