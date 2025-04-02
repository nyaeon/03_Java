package com.ohgiraffers.section02.encapsulation.resolved;

// class Monster {
public class Monster {

//    String name; // 이 경우는 접근제한자는 default, 디폴트는 생략 가능
    private String name;
    private int hp;

    public void setInfo1(String info1) {
        this.name = info1;
    }

    public void setInfo2(int info2) {
        this.hp = info2;
    }

    public String getInfo() {
        return this.name + "이고 " + this.hp + "입니다.";
    }
}
