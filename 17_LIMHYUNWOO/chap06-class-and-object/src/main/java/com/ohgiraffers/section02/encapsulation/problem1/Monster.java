package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp > 0){
            this.hp = hp;  // 내가 무슨 값을 참조했는지만 알면 햇갈일 일 없다.(Monster객체)
        } else if(hp <= 0){
            this.hp = 0;
        }
    }
}
