package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
    Application4 app = new Application4();
    app.methodA("홍길동",20,'남');
    String name ="유관순";
    int age = 20;
    char gender = '여';
    app.methodA(name,age,gender);
    }
    public void methodA(String name,int age,final char gender) {
        System.out.println("당신의 이름은 "+ name +"이며, 나이는 "+ age +" 세이고, 성별은 "+ gender +" 이다");

    }
}
