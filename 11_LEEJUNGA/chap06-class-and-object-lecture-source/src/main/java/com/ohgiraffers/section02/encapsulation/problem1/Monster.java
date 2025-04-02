package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp; // 이 메소드를 호출한 객체 (Monster 객체)
        } else if (hp <= 0) {
            this.hp = 0;
        }
    }
}
