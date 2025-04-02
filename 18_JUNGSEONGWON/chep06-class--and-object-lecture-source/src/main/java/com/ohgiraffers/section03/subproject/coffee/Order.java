package com.ohgiraffers.section03.subproject.coffee;

public class Order {

    private final String option;
    private final String name;
    private final int count;

    public Order(String option, String name, int count) {
        this.option = option;
        this.name = name;
        this.count = count;
    }

    public String getName(){
        return name;
    }
    public String getOption(){
        return option;
    }
    public int getCount(){
        return count;
    }
}
