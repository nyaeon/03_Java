package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        long lNum = 80000000000L;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum);

        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);
    }
}
