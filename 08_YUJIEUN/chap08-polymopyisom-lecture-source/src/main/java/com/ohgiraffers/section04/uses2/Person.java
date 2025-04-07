package com.ohgiraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;

    }

    public void doSomething() {
        String data= "string data";

        saveProvider.save(data);

    }
}

