package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    String path;

    /* 파일을 만드는 기능
    * creat File ( path, creatFileName)
    *
    * @param path; // 파일경로
    * @param createFileName; // 만들고자 하는 파일 이름
    * */
    String createFileName;
    public void createFile(String path, String createFileName) {
        File file = new File(path, createFileName);
        if (!file.exists()) {
            System.out.println("파일이 이미 존재합니다 : "+ file.getAbsolutePath());
        }else{
            try {
                file.createNewFile();
                System.out.println("파일 생성이 완료되었습니다"+path+createFileName);
            } catch (IOException e) {
                System.out.println("파일 생성중 문제가 발생했씁니다 : " + e.getMessage());
            }finally{
                System.out.println("파일 생성을 종료합니다.");
            }
        }
    }

    /* 파일을 읽는 기능
    * readFile (path, readFileName)
    * @param path; // 파일 경로
    * @param readFileName; // 읽고자 하는 파일 이름
    *
    * */



    String readFileName;
    public void readFile(String path, String readFileName){
        File file = new File(path, readFileName);
        if (!file.exists()) { // 파일이 존재하지 않는게 맞을 경우 true
            System.out.println("파일이 존재하지 않습니다."+file.getAbsolutePath());
            return; // 파일이 존재하지 않기때문에 아래기능을 실행 못하게 돌려보내기로 기능 종료
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line; // 한 줄 씩 읽어올때마다 읽어온 글자들을 담을 수 있는 공간 생성
            System.out.println("파일 내용 :");
            while (( line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
           System.out.println("파일을 찾을 수 없습니다" + e.getMessage());
        } catch (IOException e) {
           System.out.println("파일 찾기 이외 다른 문제가 생겼습니다"+ e.getMessage());
        }finally{
            System.out.println("파일 읽기 모드를 종료합니다");
        }
    }

    /* 파일을 이어쓰는 기능
    * writeToFileName (path, writeFileName)
    * @param path; // 파일경로
    * @param writeFileName; // 이어서 작성하고자 하는 파일 이름
    *
    * */

    String writeFileName;
    public void writeToFile(String path, String writeFileName){
        File file = new File(path, writeFileName);
        if (!file.exists()) {
            System.out.println("이어서 작성할 파일이 존재하지 않습니다."+file.getAbsolutePath());
            return;
        }
        try {
            FileWriter fw = new FileWriter(file); // (file/*, false*/) 그냥 파일은 기존 파일을 덮으쓰기하거나 새로 만드는 것임. (file, ture) 는 이어서 작성하기
            Scanner sc = new Scanner(System.in); // 파일에 글을 작성하기 위해 스캐너 사용
            System.out.println("파일에 작성할 내용을 입력하세요");
            String input = sc.nextLine(); // 파일 안에 작성할 내용 적기
            fw.write("\n"+input); // 작성하고자 하는 파일 내용 작성하기
            fw.close(); // 파일 글 다 작성하면 종료
        } catch (IOException e) {
            System.out.println("파일에 글을 이어서 작성하던 도중 문제가 발생했습니다"+e.getMessage());
        } finally {
            System.out.println("파일에 이어서 글 작성하기 모드를 종료합니다");
        }
    }
}
