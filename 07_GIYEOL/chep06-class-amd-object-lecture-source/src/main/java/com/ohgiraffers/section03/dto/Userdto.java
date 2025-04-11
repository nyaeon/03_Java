package com.ohgiraffers.section03.dto;

import java.util.Date;

public class Userdto { //Userdto
    /*
     *  자바빈(Java Bean)이란?
     *   JSP에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래스형태이다.
     *   자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을
     *   의미하는데, 그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈(Java bean)이라고 부른다.
     *   지금은 특정 목적 및 프레임워크를 위해 클래스를 작성하는 규칙이라고 보면 된다.
     * */

    /*
     *  자바빈 작성 규칙
     *  1. 자바빈은 특정 패키지에 속해 있어야 함(default 패키지 사용 금지)
     *  2. 필드의 접근제어자는 private로 선언해야 함(캡슐화 적용)
     *  3. 기본 생성자가 명시적으로 존재해야 한다.(매개변수 있는 생성자는 선택사항)
     *  4. 모든 필드에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함.
     *  5. 직렬화(Serializable 구현)를 고려해야 한다.(선택사항)
     * */
    //1.필드(멤버변수)
    private String id;
    private String pwd;
    private String Name;
    private java.util.Date enrollDate;

    //2.생성자 (기본생성자 필수로 명시적 작성)
    public Userdto() {

    }

    public Userdto(String id, String Name, String pwd, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.Name = Name;
        this.enrollDate = enrollDate;
    }
    //3.성정자와(setter) 접근자(getter)

    /*
     *  설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
     *  설정자(setter) 작성 규칙
     *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *  [표현식]
     *  public void set필드명(매개변수) {
     *      필드 = 매개변수;
     *  }
     *  [작성예시]
     *  public void setName(String name) {
     *      this.name = name;
     *  }
     * */

    /*
     *  접근자(getter) 작성 규칙
     *  : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *    각 접근자는 하나의 필드에만 접근하도록 한다.
     *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *  [표현식]
     *  public 반환형 get필드명() {
     *      return 반환값;
     *  }
     *  [작성예시]
     *  public String getName() {
     *      return this.name;
     *  }
     * */
    Userdto user1 = new Userdto();
//   System.out.println(user1);
//   user1.setid("user1");
//   System.out.println(user1.getid());
//   System.out.println(user1);

    Userdto user2 = new Userdto("user02","pass02","홍길동",new java.util.Date());
    }

