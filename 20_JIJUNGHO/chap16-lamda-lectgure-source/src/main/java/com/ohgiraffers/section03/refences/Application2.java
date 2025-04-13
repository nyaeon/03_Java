package com.ohgiraffers.section03.refences;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        Account account = new Account("홍길동");
        System.out.println(account);

        // Account에 new 연산자로 Account타입 객체 생성
        Function<String, Account> function = Account::new;
        Account account1 = function.apply("홍길동");
        Account account2 = function.apply("동길홍");
        System.out.println(account1);

    }

}
