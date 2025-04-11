package com.ohgiraffers.section03.subproject.coffee;

public class Barista {
        //주문에 따라 커피를 만듬
    private int coffeeStock = 5000; //5000그램의 커피 보유
    public Coffee[] makeCoffee(Order order){

        //재고 차감 처리 - 커피 한잔에 20g 사용
        //커피 생산
        Coffee[] coffees = new Coffee[order.getCount()];
        for(int i=0;i<coffees.length; i++){
            coffees[i] = new Coffee(order.getName(),order.getOption());
        }
        return coffees;
    }
}
