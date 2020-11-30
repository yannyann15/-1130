package com.company;

public class Student {
    String name;
    int koku;
    int su;
    int ei;

    public Student(String name,int koku,int su,int ei){
        this.name =name;
        this.koku =koku;
        this.su =su;
        this.ei = ei;

    }

    public Student(String name){
        this(name,0,0,0);

    }

    public void show(){

        System.out.println(name+":"+koku+","+su+","+ei);
    }

}