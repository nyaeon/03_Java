package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.setInfo1("드라큘라");
        monster.setInfo2(2000);

        System.out.println(monster.getInfo());

        /*
        *캡슐화(Encapsulation)란?
        *
         */
    }
}
