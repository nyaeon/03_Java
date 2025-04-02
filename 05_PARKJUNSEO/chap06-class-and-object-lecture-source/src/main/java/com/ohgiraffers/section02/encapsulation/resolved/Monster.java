package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {

    private String name;
    private int hp;

    public void setInfo1(String info1) {
        this.name = info1;
    }

    public void setInfo2(int info2) {
        this.hp = info2;
    }

    public void setHp(int hp) {
        if(hp > 100) {
            this.hp = hp;    // this : 생성했을 당시 주소값을 가지고 있음. 현재 객체를 가리키는 참조 변수 (자기 자신을 참조할 때 사용)
        } else if (hp <= 0) {
            this.hp = 0;
        }
    }

    public String getInfo() {
        return this.name + "이고" + this.hp + "입니다.";
    }
}
