package com.ohgiraffers.section02.enumtype;

public enum Subjects {
    JAVA,
    MYSQL,
    JDBC
    ,HTML
    ,CSS
    ,JAVASCRIPT;

     Subjects() {
        System.out.println("기본 생성자 호출됨");
    }
    public String toString(){
        return "@@@" + this.name() + "@@@";
    }
    public enum BackEnd {JAVA, MYSQL, JDBC, JAVASCRIPT};
     public enum FrontEnd {HTML, CSS, JAVASCRIPT};

}
