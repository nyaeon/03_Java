package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 기본생성자를 이용해서 객체를 생성
        MemberDTO member = new MemberDTO();

        System.out.print("id : " );
        member.setId(scanner.nextLine());

        System.out.print("pwd : " );
        member.setPwd(scanner.nextLine());

        System.out.print("name : " );
        member.setName(scanner.nextLine());

        System.out.print("age : " );
        member.setAge(scanner.nextInt());

        System.out.print("gender : " );
        member.setGender(scanner.next().charAt(0));
        scanner.nextLine();

        System.out.print("phone : " );
        member.setPhone(scanner.nextLine());

        System.out.print("email : " );
        member.setEmail(scanner.nextLine());

        scanner.close();

        System.out.println("");
        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());


    }
}
