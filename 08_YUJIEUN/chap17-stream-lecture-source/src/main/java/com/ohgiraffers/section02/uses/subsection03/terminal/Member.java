package com.ohgiraffers.section02.uses.subsection03.terminal;

public class Member {

    private  String ud;
    private  String name;

    public Member() {
    }

    public Member(String name, String ud) {
        this.name = name;
        this.ud = ud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUd() {
        return ud;
    }

    public void setUd(String ud) {
        this.ud = ud;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ud='" + ud + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
