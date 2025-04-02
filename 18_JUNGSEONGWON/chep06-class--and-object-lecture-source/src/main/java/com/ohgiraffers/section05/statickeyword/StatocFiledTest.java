package com.ohgiraffers.section05.statickeyword;

public class StatocFiledTest {

    private int nonStaticCount;
    private static int staticCount;

    public StatocFiledTest(){

    }

    public int getNonStaticCount(){
        return nonStaticCount;
    }
    public int getStaticCount(){
        /*
        * static필드에 접근하기 위해서는 클래스명, 필드명으로 접근한다.
        * this.으로도 접근은 가능하지만 this.을 사용하지 않는 것이 좋다.
        * */
        return StatocFiledTest.staticCount;
    }
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }
    public void increaseStaticCount(){
            StatocFiledTest.staticCount++;
    }
}

