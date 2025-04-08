package com.ohgiraffers.section03.constrctor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String Name;
    private java.util.Date enrollDate;
    /*
     * 생성자의 작성 위치
     * 작성위치는 문법상으로는 클래스 내부에 작성하면 되지만
     * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
     * */

    /*
     * 생성자의 사용 목적
     * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
     * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할
     *    목적으로 주로 사용된다.
     * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
     *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다.(초기값 전달 강제화)
     * */
    // 기본생성자(), 매개변수있는생성자(값,값,값)
    /*
     * 생성자 작성 방법
     * [표현식]
     * 접근제한자 클래스명([매개변수]) {
     *      인스턴스 생성 시점에 수행할 명령 기술(주로 필드를초기화)
     *      this.필드명 = 매개변수;    // 설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     * }
     *
     * 생성자 작성 시 주의할 점
     * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다.(대/소문자까지 같아야한다.)
     * 2. 생성자 메소드는 반환형을 작성하지 않는다.(작성하는 경우 생성자가 아닌 메소드로 인식한다.)
     * */

    /*
     * 생성자의 종류
     * 1. 기본생성자(매개변수가 없는 생성자)
     * 2. 매개변수 있는 생성자
     *
     * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수도 있다.
     * 매개변수 있는 생성자가 한개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
     * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
     * */
    public User(){
        System.out.println("user 클래스의 기본 생성자 호출");
    }
    // public User(){} 한클래스 안에서 동일한 생성자, 메소드 생성은 불가
    // id와 pwd,name의 초기화를 담당할 생성자

    public User(String pwd, String id, String name) {
        this.pwd = pwd;
        this.id = id;
        this.Name = name;
        System.out.println("user 클래스를 초기화하는 생성자 호출");
    }
        //모든 필드를 초기화하는 생성자

    public User(String id, String pwd, String name, Date enrollDate) {
     //   this.id = id;
     //   this.pwd = pwd;
     //   this.Name = name;
        //this()를 이용해 다른 생성자를 활용하여 코드를 줄 수 있다
        //this()를 이용해 다른 생성자를 활용할 때는 항상 첫줄에 있어야 한다
        this(id,pwd,name);
        this.enrollDate = enrollDate;
        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출됨");
    }


    public String information(){
        return "ID: " + this.id + "Name: " + this.Name + "Enroll Date: " + this.enrollDate;
    }



}
