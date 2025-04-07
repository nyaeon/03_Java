package HOMEWORK2_week.chep10.api.member;

import java.time.LocalDate;

public class Question {
    private int memberno;
    private String membername;
    private int height;
    private int weight;
    private LocalDate birth;


    public Question() {
    }

    public Question(int memberno, String membername, int height, int weight, LocalDate birth) {
        this.memberno = memberno;
        this.membername = membername;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public int getMemberno() {
        return memberno;
    }

    public void setMemberno(int memberno) {
        this.memberno = memberno;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String information() {
        return
                " 번호 = " + memberno +
                ", 이름 = " + membername +
                ", 키 = " + height +
                ", 무게 = " + weight +
                ", 생일 = " + birth ;
    }
}

