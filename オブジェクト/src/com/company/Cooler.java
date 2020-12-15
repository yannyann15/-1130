package com.company;

public class Cooler {
    protected int nowTemp;
    protected int goalTemp;

    public Cooler(int nowTemp){
        this.nowTemp = nowTemp;
    }


    public void setGoalTemp(int goalTemp){
        this.goalTemp =goalTemp;
    }

    public void adjust(){
        if(nowTemp > goalTemp){
            nowTemp--;
            System.out.println("室温を1度下げました。");

        }else{
            System.out.println("適温です。");
        }
    }
}
