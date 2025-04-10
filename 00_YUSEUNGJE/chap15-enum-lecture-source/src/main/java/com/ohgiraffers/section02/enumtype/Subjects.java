package com.ohgiraffers.section02.enumtype;

public enum Subjects {

    JAVA,   // 0
    MYSQL,  // 1
    JDBC,   // 2
    HTML,   // 3
    CSS,    // 4
    JAVASCRIPT; //5

    Subjects() {
        System.out.println("기본 생성자 호출됨....");
    }

    public String toString() {
        return "@@@@" + this.name() + "@@@@";
    }

    public enum BackEnd { JAVA, MYSQL, JDBC, JAVASCRIPT };
    public enum FrontEnd { HTML, CSS, JAVASCRIPT};
}
