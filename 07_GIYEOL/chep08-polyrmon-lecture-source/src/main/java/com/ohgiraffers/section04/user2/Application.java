package com.ohgiraffers.section04.user2;

public class Application {
    public static void main(String[] args) {
        Databasesaveprovider saveProvider = new Databasesaveprovider();
        FIlesaveprovider filesaveprovider = new FIlesaveprovider();

        Person person = new Person(filesaveprovider);
        person.doSomething();
    }
}
