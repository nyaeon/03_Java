package com.ohgiraffers.section05.statickeyword;

public class DepartmentgStore {

    //백화점 : 한정판 신발판매점 상품
    public static int stock = 30;

    public void getStockCount(){
        System.out.println(">>>>>>>>>>>>> 현재 : " + stock + "개 남았습니다.");
    }
    public void buyProduct(int num){
        System.out.println(">>>>>>>>>>>>> 상품 : " + num + "개 구해했습니다.");
        stock -= num;
    }
}
