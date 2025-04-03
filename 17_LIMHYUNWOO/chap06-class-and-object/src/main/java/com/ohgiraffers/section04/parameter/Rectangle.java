package com.ohgiraffers.section04.parameter;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() { // 기본생성자
    }
    public Rectangle(int width, int height) { //매개변수 있는 생성자
        this.width = width;
        this.height = height;
    }
    public void calArea(){
        System.out.println("사각형의 넓이는 "+(this.width*this.height));
    }
    public void calRound(){
        System.out.println("사각형의 둘레는 "+((this.width + this.height) * 2));
    }
}
