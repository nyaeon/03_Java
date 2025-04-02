package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        Monster monster1 = new Monster();
        //monster1.name = "드라큘라";
        //monster1.hp = 200;

        //System.out.println("monster name : " + monster1.name);
        //System.out.println("monster hp : " + monster1.hp);

        monster1.setInfo1("프랑켄슈타인");
        monster1.setInfo2(200);

        System.out.println(monster1.kinds);

    }
}
