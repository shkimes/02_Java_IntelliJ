package com.kh.Oop.constructorPre;

public class Cafe {

    // 필드
        // 메뉴이름
        // 가격
        // 주문수량
    // 메서드
        // 1. 기본생성자
        // 2. 필수생성자
        // 3. Setter
        // 4. Getter
        // 5. 주문 총액 계산 price + quantity 전달
        // 6. 주문 출력 toString @Override 사용해서 출력
    private String name;
    private int price;
    private int quantity;

    public Cafe() {
    }

    public Cafe(int quantity, int price, String name) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Cafe: " + name + "를 시켜셨으며 " + price + "원 이고 " + quantity+"개 주문하셨습니다.");
        System.out.println("총 가격은 :"+price*quantity+("원 입니다."));
    }



    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
