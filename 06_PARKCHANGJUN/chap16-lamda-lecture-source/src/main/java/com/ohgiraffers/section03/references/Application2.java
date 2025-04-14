package com.ohgiraffers.section03.references;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        // 인스턴스 생성
        Account account = new Account("홍길동");
        System.out.println(account);

//        Account::new - Account 연산자에 new 객체 생성. 따라서 홍길동을 가져옴.
        Function<String, Account> function = Account::new;
        Account account1 = function.apply("홍길동");
        System.out.println(account1);
    }
}
