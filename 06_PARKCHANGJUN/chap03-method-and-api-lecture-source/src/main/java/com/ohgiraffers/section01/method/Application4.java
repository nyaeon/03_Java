package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        app.testMethodA("홍길동", 20, '남');

        String name =  "유관순";
        int age = 20;
        char gender = '여';
        app.testMethodA(name, age, gender);
    }

    public void testMethodA(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
