package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;
public void setHp (int hp) {
    if (hp > 0) {
        // this : 자기가 생성된 주소값
        this.hp = hp;
    } else if (hp <= 0) {
        this.hp = 0;
    }
}
}
