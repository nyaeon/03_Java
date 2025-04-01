package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        app.testMethodA("홍길동", 20, '남');

<<<<<<< HEAD
        String name =  "유관순";
        int age = 20;
        char gender = '여';
        app.testMethodA(name, age, gender);
    }

    public void testMethodA(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
=======
        String name = "유관순"; // 변수 선언 시 자료형을 명시해야 함
        int age = 20; // 변수 선언 시 자료형을 명시해야 함
        char gender = '여'; // 변수 선언 시 자료형을 명시해야 함

        app.testMethodA(name, age, gender); // testMethodA 호출 시 app.을 통해 호출해야 함
    }

    public void testMethodA (String name, int age, final char gender){ // final 키워드는 매개변수 수정 방지 목적, 필수는 아님
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");

    }
}
>>>>>>> a8fb790 (수정4)
