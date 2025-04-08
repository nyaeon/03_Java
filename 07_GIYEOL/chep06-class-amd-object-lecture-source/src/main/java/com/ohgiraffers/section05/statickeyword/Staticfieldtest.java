package com.ohgiraffers.section05.statickeyword;

public class Staticfieldtest {
    private int nonstaticcount;
    private static int staticcount;
    public Staticfieldtest() {

    }

    public int getNonstaticcount() {
        return nonstaticcount;
    }

    public int getStaticcount() {
        /***
         * static 필드에 접근하기 위해서 클래스명.필드명으로 접근
         * this.으로도 접근이 가능하지만 this.를 사용하지 않는 것이 좋다
         */
        return Staticfieldtest.staticcount;

    }
    public void incrementNonstaticcount() {
        this.nonstaticcount++;
    }
    public void incrementStaticcount() {
        Staticfieldtest.staticcount++;
    }
}
