package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {
        // 필드에 직접 접근 시 발생할 수 있는 문제점
        Monster monster1 = new Monster(); //객체생성

        monster1.name = "드라큘라"; // 참조연산자(.)를 통해서 값을 대입
        monster1.hp = 200;

        System.out.println("monster1의 이름 : " + monster1.name);
        System.out.println("monster1의 체력 : " + monster1.hp);

        Monster monster2 = new Monster(); //객체생성

        monster2.name = "프랑켄슈타인";
        monster2.hp = -200;

        System.out.println("monster2의 이름 : " + monster2.name);
        System.out.println("monster2의 체력 : " + monster2.hp);

        Monster monster3 = new Monster(); //객체생성

        monster3.name = "미라";
        monster3.setHp(200);

        System.out.println("monster3의 이름 : " + monster3.name);
        System.out.println("monster3의 체력 : " + monster3.hp);
    }
}
