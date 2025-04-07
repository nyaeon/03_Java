package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        monster monster = new monster();
   //     monster.name ="드라큘라";
   //     monster.hp = 200;
   //     System.out.println("monster 이름은 "+monster.name);
   //     System.out.println("monster 체력은 "+monster.hp);
        monster.serinfo1("프랑켄");
        monster.serinfo2(200);
        System.out.println(monster.name);
    }
}
