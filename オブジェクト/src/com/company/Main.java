package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Shop s1 = new Shop();
        Shop s2 = new Shop();
        s1.name = "パン屋";
        s1.sale = 100000;
        s2.name = "洋服屋";
        s2.sale = 150000;
        System.out.println(s1.name + "売上" + s1.sale);
        System.out.println(s2.name + "売上" + s2.sale);


    }

}
