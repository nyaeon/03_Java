package com.ohgiraffers.section02.encapsulation.problem1;

public class monster {
    String name;
    int hp;
    public void sethp(int hp){
        if(hp>0){
            this.hp =hp; //이 메소드를 호출한 것 = >this:자기가 생성된 주소 값
        } else if (hp <=0) {
            this.hp =0;
        }
    }
}
