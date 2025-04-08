package com.ohgiraffers.section03.subproject.coffee;

public class Order {
    private final String name;
    private final String option;
    private final int count;
    public Order(String name, String option, int count) {
        this.name = name;
        this.option = option;
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
