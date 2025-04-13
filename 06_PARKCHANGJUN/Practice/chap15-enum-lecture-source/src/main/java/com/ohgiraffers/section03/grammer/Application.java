package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

    public static void main(String[] args) {

        /*
         * enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스를 생성하고 생성자를
         * 따로 호출하지 않는다. 또한 enum 타입은 set으로 바꿔 반복시키며 필드들을
         * 한번에 확인하고 활용할 수 있다.
         */

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin.name().toString());
        System.out.println(admin.getNameToLowercase());
        System.out.println();

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println("consumer = " + consumer);
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        // 최초 사용시에만 열거 타입의 인스터스를 생성하고 이후에는 생성자를 호출하지 않는다.
        System.out.println();
        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println("consumer == consumer2 = " + (consumer == consumer2));

        System.out.println();
        System.out.println("Set으로 바꿔 반복자를 활용해 보자.");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class); // allOf 메소드
        Iterator<UserRole2> userIterator = roles.iterator();
        while (userIterator.hasNext()) {
            UserRole2 role = userIterator.next();
            System.out.println(role.ordinal() + " " + role.name() + " " + role.getDescription());
        }

        System.out.println();
        System.out.println("=====================================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIterator2 = users.iterator();
        while (userIterator2.hasNext()) {
            UserRole2 role = userIterator2.next();
            System.out.println(role.ordinal() + " " + role.name() + " " + role.getDescription());
        }


    }
}
