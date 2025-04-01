package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        Calculator a = new Calculator();
        a.checkMethod();

        Calculator b = new Calculator();
        int x = 10;
        int y = 20;
        String result1 = b.sumTwoNumber(x, y);

        Calculator c = new Calculator();
        String result2 = c.multiTwoNumber(x, y);

        Calculator d = new Calculator();
        int result3 = d.multiTwoNumber2(x, y);


        
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
    }
}
