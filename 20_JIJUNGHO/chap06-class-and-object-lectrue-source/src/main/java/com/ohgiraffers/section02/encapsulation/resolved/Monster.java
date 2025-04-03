package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {

    // 다른 파일에서 참조 연산자로 접근을 못함
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
