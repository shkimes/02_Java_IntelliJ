package com.kh.pack2.pre4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HapptLunchRead {
    public  void readText(String path, String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) !=null ){
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found"+e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없는 문제 이외에 다른 문제가 발생했습니다."+e.getMessage());
        }
    }
}