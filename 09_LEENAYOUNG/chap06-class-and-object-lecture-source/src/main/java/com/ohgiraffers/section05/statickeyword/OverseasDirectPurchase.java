package com.ohgiraffers.section05.statickeyword;

public class OverseasDirectPurchase {

    public void buyDirectPurchase(int num) {

        System.out.println(">>>>>>>>>>>>>>> 해외 직구로 " + num + "개 구매합니다.");
        DepartmentStore.stock -= num;
    }
}
