package com.ohgiraffers.section04.parameter;

public class Overseasdirectpurchase {
    public void buydirectpurchase(int num) {
        System.out.println("해외 직구로"+num+"개 구매");
        Departmentstore.stock -= num;
    }
}
