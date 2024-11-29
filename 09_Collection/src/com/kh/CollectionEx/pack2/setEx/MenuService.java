package com.kh.CollectionEx.pack2.setEx;
import java.util.HashSet;
public class MenuService {

    private HashSet<Menu> menuSet = new HashSet<>();

    //메뉴 추가
    public void addMenu(Menu menu) {
        if (menuSet.add(menu)) {
            System.out.println("메뉴가 추가되었습니다" + menu);
        } else {
            System.out.println("이미 존재합니다" + menu);
        }
    }
//
        // 메뉴 삭제
        public void removeMenu(int id){ // 원하는 id값을 입력하고
            for(Menu menu : menuSet) { // 메뉴를 순차적으로 확인했을때
                if (menu.getId() == id) { // 삭제를 원하는 id값이 존재한다면
                    menuSet.remove(menu); // 메뉴를삭제
                    break;                  // 삭제하고나서 if문 종료
                }
            }
        }

        // 메뉴 검색
        public Menu searchMenu(int id){ // 검색하고자 하는 id를 입력받고
            for (Menu menu : menuSet){ // 메뉴리스트를 순차적으로 확인했을 때
                if (menu.getId() == id){ // 검색하고자 하는 id값이 존재한다면
                    return menu; // 메뉴를 전달해서 보여주고
                }
            }

            // 검색한 메뉴 id 가 존재해지 않는다면
            System.out.println("검색된 메뉴가 없습니다.");
            return null;

        }





        // 모든 메뉴 출력
        public void printAllMenu () {
        // 만약에 메뉴리스트가 비어있다면
            if (menuSet.isEmpty()) {


                System.out.println("조회할 메뉴가 존재하지 않습니다");
            } else {
                for (Menu menu : menuSet) {
                    System.out.println(menu);
                }
            }

        }
    }
