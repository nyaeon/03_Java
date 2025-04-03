package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] emp = new EmployeeDTO[3];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new EmployeeDTO();
        }

        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000,  0.01, "01011112222", "서울 마곡");
        System.out.println(emp[0].information());
        System.out.println(emp[1].information());
        System.out.println(emp[2].information());
        System.out.println("====================================================================================================");
        emp[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println(emp[0].information());
        System.out.println(emp[1].information());
        System.out.println("====================================================================================================");

        System.out.println("김말똥의 연봉 : " + (int) ((emp[0].getSalary() + ((emp[0].getSalary() * emp[0].getBonusPoints()))) * 12) + "원");
        System.out.println("홍길동의 연봉 : " + (int) ((emp[1].getSalary() + ((emp[1].getSalary() * emp[1].getBonusPoints()))) * 12) + "원");
        System.out.println("강말순의 연봉 : " + (int) ((emp[2].getSalary() + ((emp[2].getSalary() * emp[2].getBonusPoints()))) * 12) + "원");
        System.out.println("====================================================================================================");

        int sum = 0;
        int avg = 0;
        for (int i=0; i< emp.length; i++) {
            sum += (int) ((emp[i].getSalary() + ((emp[i].getSalary() * emp[i].getBonusPoints()))) * 12);
        }
        avg = sum / emp.length;
        System.out.println("직원들의 연봉의 평균 : " + avg + "원");


    }
}
