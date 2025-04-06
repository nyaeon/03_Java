package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String s){
        if(s==null){
            return s;
        }
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public int charSu(String s, char c){
        if(s==null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count ++;
            }
        }
        return count;
    }
}
