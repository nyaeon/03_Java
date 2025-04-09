package com.ohgiraffers.api.string;

public class StringProcess {

  String preChar(String s) {
    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }

  int charSu(String s, char ch){
    int cnt=0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == ch){
        cnt++;
      }
    }
    return cnt;
  }
}
