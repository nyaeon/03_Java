package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();  // 객체 생성
        monster1.name = "드라큘라";
        monster1.hp = 200;

        System.out.println("monster1의 이름 : " + monster1.name);
        System.out.println("monster1의 체력 : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.hp = -200;

        System.out.println("monster2의 이름 : " + monster2.name);
        System.out.println("monster2의 체력 : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        monster3.setHp(-200);
        monster3.setHp(100);
        System.out.println("monster3의 이름 : " + monster3.name);
        System.out.println("monster3의 체력 : " + monster3.hp);

    }
}
