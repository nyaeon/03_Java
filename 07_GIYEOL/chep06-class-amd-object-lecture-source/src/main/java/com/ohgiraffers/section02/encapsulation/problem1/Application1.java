package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {
        monster monster1 = new monster();
        monster1.name = "드라큘라"; //참조 연산자를 통해 값을 대입
        monster1.hp = 200;
        System.out.println("monster1의 이름은 "+monster1.name);
        System.out.println("monster1의 체력은 "+monster1.hp);
        monster monster2 = new monster();
        monster2.name ="프랑켄슈타인";
        monster2.hp = -200;
        System.out.println("monster2의 이름은 "+monster2.name);
        System.out.println("monster2의 체력은 "+monster2.hp);
        monster monster3 = new monster();
        monster3.name ="미라";
        monster3.sethp(-200);
        monster3.sethp(100);
        System.out.println("monster3의 이름은 "+monster3.name);
        System.out.println("monster3의 체력은 "+monster3.hp);
    }
}
