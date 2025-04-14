package com.ohgiraffers.section02.uses.subsection03.terminal;

public class Member {

    private String id;
    private String name;

    public Member() {
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ']';
    }
}
