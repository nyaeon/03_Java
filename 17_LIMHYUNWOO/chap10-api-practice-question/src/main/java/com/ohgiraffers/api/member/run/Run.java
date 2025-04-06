package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.vo.Member;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
        Member[] member = new Member[3];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] str=  input.split("[\"\\|,]");

        for(int i = 0; i < member.length; i++) {
            LocalDate birth = LocalDate.of(Integer.parseInt(str[i*5+5].substring(0,4)),Integer.parseInt(str[i*5+5].substring(4,6)),Integer.parseInt(str[i*5+5].substring(6)));
            member[i] = new Member(Integer.parseInt(str[i*5+1]),str[i*5+2],Integer.parseInt(str[i*5+3]),Integer.parseInt(str[i*5+4]),birth);
        }
        for(int i = 0; i < member.length; i++) {
            System.out.println(member[i].information());
        }

    }
}
