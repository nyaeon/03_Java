package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {

    public static void main(String[] args) {
             Monster monster = new Monster();
//           monster.name = "드라큘라";
//           monster.hp = 100;
             monster.setInfo1("드라큘라");
             monster.setInfo2(2000);
             System.out.println(monster.getInfo());

             /*
             * 캡슐화(Encapsulaiont)란?
             * 캡슐화는 유지보수를 증가시키기 위해 필드의 접근을 제한하고
             * public 메소드를 이용해서 간접적으로(우회해서) 접근하여 사용할 수 있도록 만든 기술이다.
             * 클래스 작성 시 특별한 목적이 있지 않다면 캡슐화를 적용하는 것을 기본원칙으로 하고 있다.*/
    }
}
