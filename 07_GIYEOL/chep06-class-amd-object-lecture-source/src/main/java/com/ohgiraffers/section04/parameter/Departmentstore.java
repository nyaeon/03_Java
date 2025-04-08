package com.ohgiraffers.section04.parameter;

public class Departmentstore {
    //백화점 : 한정판 신발 판매
    public static  int stock =30;
    public void getstockcount() {
        System.out.println("현재 :"+stock+"개 남음");
    }
    public void buyproduct(int num) {
        System.out.println("상품을"+num+"개 구매");
        stock -= num;
    }



}
