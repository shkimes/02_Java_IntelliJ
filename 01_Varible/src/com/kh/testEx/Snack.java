package com.kh.testEx;

public class Snack {
    private String name;
    private String flavor;
    private int price;

    public Snack(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}
