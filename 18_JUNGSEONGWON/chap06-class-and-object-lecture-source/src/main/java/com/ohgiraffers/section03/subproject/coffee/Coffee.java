package com.ohgiraffers.section03.subproject.coffee;

public class Coffee {

    private final String name;
    private final String option;

    public Coffee(String name, String option) {
        this.name = name;
        this.option = option;
    }

    public String getName(){
        return name;
    }
    public String getOption(){
        return option;
    }
    public String toString(){
        return "%s($s)".formatted(name,option);
    }
}
