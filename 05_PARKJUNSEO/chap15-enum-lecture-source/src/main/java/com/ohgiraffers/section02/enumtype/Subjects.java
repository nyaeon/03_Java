package com.ohgiraffers.section02.enumtype;

public enum Subjects {

    JAVA,   // 0
    MYSQL,  // 1
    JDBC,   // 2
    HTML,   // 3
    CSS,    // 4
    JAVASCRIPT; // 5

    /*
    * 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다.
    * 작성한 순서에 따라 각각은 다른 인스턴스가 생성되어 최초 호출 시에 enum의 생성자를 활용해 생성한다.
    * */
    Subjects() {

        System.out.println("기본 생성자 호출됨");
    }



        @Override
        public String toString() {
            return "@@@@ " + this.name() + " @@@@";
    }

    public enum Backend {JAVA, MYSQL, JDBC, JAVASCRIPT}
    public enum Frontend {HTML, CSS, JAVASCRIPT}

}

