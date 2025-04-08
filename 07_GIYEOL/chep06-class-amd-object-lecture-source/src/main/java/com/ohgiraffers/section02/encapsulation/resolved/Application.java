package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    public static void main(String[] args) {
        monster monster = new monster();
     //   monster.name = "양";
     //   monster.hp = 100;
        monster.setinfo1("드라큘라");
        monster.setinfo2(2000);
        System.out.println(monster.getinfo());
        /***
         * 캡슐화는 유지보수를 증가시키기 위해 필드의 직접 접근으르 제한하거
         * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술
         * 클래스 작성 시 특별한 목적이 있지 않다면 캡슐화를 적용하는 것을 기본원칙으루 함
         */
   
    }
}
