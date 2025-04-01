package com.ohgiraffers.section02.encapsulation.problem2.problem1;

public class Monster {

    String name;
    int hp;

    public void setHp(int hp){
        if(hp > 0) {
            this.hp = hp; // this <= 자기가 생성된 주소값만 가지고 있다. 호출하는 것에 따라 this는 달라진다.
        } else if ( hp <= 0) {
            this.hp = 0;
        }
    }

}
