package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        // 기본 생성자를 이용해서 객체를 생성
        MemberDTO member = new MemberDTO();

        // 강사님 설명 추가 부분
        System.out.println(member); //  주소값이 나옴. jvm이 기본값을 이용해 넣어준거임.
        System.out.println(member.getId());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getEmail());
        System.out.println(member.getPhone());

        // 변경 후
        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("user01@gmail.com");

        //setter로 받은 값 getter로 반환해 sout이용해 출력
        System.out.println("변경 후 : " + member.getId());
        System.out.println();


        // =========================================================
        //getter 여기는 내가 푼 부분
        member.getId();
        System.out.println("id : " + member.getId());

        member.getPwd();
        System.out.println("pwd : " + member.getPwd());

        member.getName();
        System.out.println("name : " + member.getName());

        member.getAge();
        System.out.println("age : " + member.getAge());

        member.getGender();
        System.out.println("gender : " + member.getGender());

        member.getPhone();
        System.out.println("phone : " + member.getPhone());

        member.getEmail();
        System.out.println("email : " + member.getEmail());

        // 변경 후 값을 넣을 때는 setter

        member.setId("user01");
        System.out.println("변경 후 id : " + member.getId());

        member.setPwd("pass01");
        System.out.println("변경 후 pwd : " + member.getPwd());

        member.setName("홍길동");
        System.out.println("변경 후 name : " + member.getName());

        member.setAge(20);
        System.out.println("변경 후 age : " + member.getAge());

        member.setGender('M');
        System.out.println("변경 후 gender : " + member.getGender());

        member.setPhone("010-1234-5678");
        System.out.println("변경 후 phone : " + member.getPhone());

        member.setEmail("hong123@greedy.com");
        System.out.println("변경 후 email : " + member.getEmail());


    }


}
