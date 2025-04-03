package com.ohgiraffers.section04.uses2;

public class Application {

    public static void main(String[] args) {
        DataBaseSaveProvider saveProvider = new DataBaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(fileSaveProvider);
        person.doSomething();
    }
}
