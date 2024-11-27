package com.kh.CollectionEx.pack2.setEx;
import java.util.HashSet;
public class 회원기능 {




    private HashSet<회원> userlist = new HashSet<>();

    public void addUser(int id, String username, String email,String hobby) {
    회원 user = new 회원(id, username, email, hobby);
        if (userlist.add(user)) {
            System.out.println("회원정보가 추가되었습니다" + user );
        } else {
            System.out.println("이미 존재하는 회원입니다" + user );
        }
    }

    public void allUser(){
        for(회원 u : userlist){
            System.out.println(u);
        }
    }
    public void removeUser(int id) {
        for (회원 user : userlist){
            if (user.getId() == id){
                userlist.remove(user);
                break;
            }

        }
    }

    public void searchUser(int id) {
        for (회원 user : userlist){
            if (user.getId() == id){
                System.out.println(user+"아이디를 찾았습니다");
                return ;
            }
        }
    }
}
