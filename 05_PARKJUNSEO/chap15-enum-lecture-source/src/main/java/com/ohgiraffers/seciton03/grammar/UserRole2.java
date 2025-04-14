package com.ohgiraffers.seciton03.grammar;

public enum UserRole2 {

    /*
    * 각각의 요소들이 특정한 값을 가지게 할 수도 있다.
    * */

    GUEST("게스트"),    // 각각은 인스턴스임 // 매개변수 있는 생성자를
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    // 이런식으로 생성자를 만들어줘야 함
    UserRole2(String description) {
        System.out.println("description = " + description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
