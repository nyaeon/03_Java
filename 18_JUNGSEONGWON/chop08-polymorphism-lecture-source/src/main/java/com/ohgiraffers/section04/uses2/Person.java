package com.ohgiraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider;
    // 기본생성자가 없어 그냥 생성은 안되고 매개변수를 안에 넣줘야 사용이 가능핟.ㅏ
    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }
    public void doSomething(){
        String data = "string data";

        saveProvider.save(data);
    }
}
