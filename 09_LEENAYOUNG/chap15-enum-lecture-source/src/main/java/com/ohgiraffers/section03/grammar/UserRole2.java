package com.ohgiraffers.section03.grammar;

public enum UserRole2 {

    /* 각각의 요소들이 특정한 값을 가지게 할 수도 있다. */
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    UserRole2(String description) {
        System.out.println("description: " + description);
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
