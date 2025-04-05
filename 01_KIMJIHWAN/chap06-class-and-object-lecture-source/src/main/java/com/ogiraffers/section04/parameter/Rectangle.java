package com.ogiraffers.section04.parameter;

import java.lang.annotation.Retention;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle() {  // 기본생성자
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calArea() {
        System.out.println("사각형의 넓이는 " + (this.width * this.height));
    }

    public void calRound() {
        System.out.println("사각형의 둘레는 " + ((this.width * this.height) * 2));
    }
}


