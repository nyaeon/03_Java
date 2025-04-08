package com.ohgiraffers.section05.single;

public class Lazysingle {
    private static Lazysingle lazy;

    private Lazysingle() {}
    public static Lazysingle getInstance(){
        if(lazy == null){
            lazy = new Lazysingle();
        }
        return lazy;
    }

}
