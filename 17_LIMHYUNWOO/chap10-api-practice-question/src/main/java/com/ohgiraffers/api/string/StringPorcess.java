package com.ohgiraffers.api.string;

public class StringPorcess {

    public String preChar(String s){
        return s;
    }

    public int charSu(String s,char ch){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch)
                cnt++;
        }
        return cnt;
    }
}
