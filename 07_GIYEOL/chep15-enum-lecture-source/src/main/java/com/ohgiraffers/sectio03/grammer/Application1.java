package com.ohgiraffers.sectio03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {
        /***
         * Enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스를 생성하고 생서자를
         * 따로 호출하지 않음, 또한 enum 타입은 set으로 바꿔 반복시키며 필드들을
         * 한번에 확인하고 사용가능함
         */
        UserRole1 admin =UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer=UserRole2.CONSUMER;
        System.out.println("consumer = "+consumer);
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        //최초 사용시에만 열거 타입의 인스턴스를 생성하고 이후에는 생성자를 호출하지 않음
        UserRole2 consumer2=UserRole2.CONSUMER;
        System.out.println("consumer == consumer2 "+(consumer == consumer2));

        System.out.println("set으로 바꿔 반복자를 활용");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> useriterator = roles.iterator();
        while (useriterator.hasNext()) {
            UserRole2 role = useriterator.next();
            System.out.println(role.name() + " " + role.ordinal());
        }
        System.out.println("=============================================================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> useriterator2 = users.iterator();
        while (useriterator2.hasNext()) {
            UserRole2 role = useriterator2.next();
            System.out.println( role.ordinal() + " " + role.name() + " " + role.getDescription());
        }

    }
}
