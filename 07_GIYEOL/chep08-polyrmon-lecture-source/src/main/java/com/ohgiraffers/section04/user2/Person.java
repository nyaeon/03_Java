package com.ohgiraffers.section04.user2;

public class Person {
    private Saveprovider saveprovider;
    public Person(Saveprovider saveprovider) {
        this.saveprovider = saveprovider;
    }
    public void doSomething() {
        String data ="string data";
        saveprovider.save(data);
    }


}
