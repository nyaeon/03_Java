package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if(hp > 0) { // this는 생성했을 주소값을 가지고있음.
            this.hp = hp; // 이 메소드를 호출한 객체(monster 객체)를 가지고 있음.
        } else if(hp <= 0) { //음수는 못들어오겠끔 막음.
            this.hp = 0;
        }
    }
}
