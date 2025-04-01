package com.ohgiraffers.section04.parameter;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle() { // 기본 생성자

    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void calArea() {
        System.out.println("사각형의 넓이는 " + (this.height * this.width));
    }
    
    public void caldul() {
        System.out.println("사각형의 둘레레는 " + (2 * (this.height + this.width)));
    }

}
