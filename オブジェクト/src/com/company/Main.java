package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "タロウ";
        s1.score = 75;
        s2.name = "ハナコ";
        s2.score = 80;

        s1.showScore();
        s2.showScore();

    }

}
