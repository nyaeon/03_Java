package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] sd = new StudentDTO[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag == true) {
            int grade = sc.nextInt();
            int classRoom = sc.nextInt();
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            sd[cnt] = new StudentDTO(grade, classRoom, name, kor, eng, math);
            cnt++;
            char check = sc.next().charAt(0);
            if(check == 'N' || check == 'n') {
                flag = false;
            }else{
                flag = true;
            }
        }
        for(int i = 0 ; i <cnt ; i++){
            System.out.println(sd[i].information());
        }
    }
}
