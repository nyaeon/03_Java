package com.ohgiraffers.section03.reference;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        Account account = new Account("hg");
        System.out.println(account);

        Function<String,Account> function = Account::new;
        Account account1 = function.apply("hg");
        System.out.println(account1);

    }
}
