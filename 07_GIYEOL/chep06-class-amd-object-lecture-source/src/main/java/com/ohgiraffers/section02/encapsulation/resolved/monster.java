package com.ohgiraffers.section02.encapsulation.resolved;

public class monster {
    private String name;
    private int hp;
    public void setinfo1(String name) {
        this.name = name;
    }
    public void setinfo2(int hp) {
        this.hp = hp;
    }
    public String getinfo(){
        return this.name +"이고, hp는 "+this.hp+"이다";
    }
}
