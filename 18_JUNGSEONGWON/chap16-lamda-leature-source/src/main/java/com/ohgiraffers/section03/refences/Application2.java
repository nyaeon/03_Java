package com.ohgiraffers.section03.refences;

import java.sql.SQLOutput;
import java.util.function.Function;

public class Application2 {

    public static void main(String[] args){

        Account account = new Account("홍길동");
        System.out.println(account);

        Function<String ,Account> function = Account::new; // 9번째 줄과 동일한 내용
        Account account1 = function.apply("홍길동");
        System.out.println(account1);
    }
}
