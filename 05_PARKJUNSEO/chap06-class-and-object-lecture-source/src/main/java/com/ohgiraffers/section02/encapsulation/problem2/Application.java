package com.ohgiraffers.section02.encapsulation.problem2;

import com.ohgiraffers.section02.encapsulation.problem1.Monster;

public class Application {
    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.name = "드라큘라";
        monster.hp = 200;

        System.out.println("monster name = " + monster.name);
        System.out.println("monster hp = " + monster.hp);
    }

}
