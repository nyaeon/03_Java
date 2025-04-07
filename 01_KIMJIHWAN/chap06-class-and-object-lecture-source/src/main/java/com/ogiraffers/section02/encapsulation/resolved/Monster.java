package com.ogiraffers.section02.encapsulation.resolved;

public class Monster {

    private String name;
    private int hp;
    private int mp;

    public void setinfo1(String info1){
        this.name = info1;
    }

    public void setinfo2(int info2){
        this.hp = info2;
    }

    public String getInfo(){
        return this.name + "이고 " + this.hp + "입니다.";
    }
}
