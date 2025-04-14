package com.ohgiraffers.section03.reference;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        Account account = new Account("홍길동"); // 기본생성자를 통해 생성한거고, 이름을 넣으면 오너네임 들어간 매개변수 생성자 사용하는거
        System.out.println(account);

        Function<String, Account> function = Account::new; //그럼 위랑 같음. 객체 생성하는 것임. 매개변수로 받아서 리턴값도 줄게요가 되는 거
        Account account1 = function.apply("홍길동");
        System.out.println(account1);
    }
}
