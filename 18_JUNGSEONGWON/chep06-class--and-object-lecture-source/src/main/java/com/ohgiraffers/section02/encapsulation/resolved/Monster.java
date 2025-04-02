package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {

    private String name;
    private int hp;

    public void setInfo1(String info1){
        this.name = info1;
    }
    public void setInfo2(int info2){
        this.hp = info2;
    }
    public String getInfo(){
        return this.name + "이고 " + this.hp + "입니다";
    }
}
