package com.ohgiraffers.section02.enumtype;

public enum Subjects {

    JAVA,   // 0
    MYSQL,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;    // 5

    Subjects() {
        System.out.println("기본 생성자 호출됨...");
    }

    public String toString() {
         return "@@@@" + this.name() + "@@@@";
    }

    public enum BackEnd {JAVA, MYSQL, JDBC, JAVASCRIPT};
    public enum FrontEnd {HTML, CSS, JAVASCRIPT};
}
