package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];

        emp[0] = new EmployeeDTO();
        System.out.println(emp[0].information());

        emp[1] = new EmployeeDTO(1, "홍길동",null,null, 19,'M', 0, 0.1, "01022223333", "서울 잠실");
        System.out.println(emp[1].information());

        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println(emp[2].information());

        System.out.println("\n------------------------------------------------------------------------------------");

        emp[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        System.out.println(emp[0].information());

        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println(emp[1].information());

        System.out.println("\n------------------------------------------------------------------------------------");

        System.out.println("김말똥씨의 연봉은: " + (int) (emp[0].getSalary()*(emp[0].getBonusPoints()+1)*12));
        System.out.println("홍길동씨의 연봉은: " + (int) (emp[1].sumsalary()));
        System.out.println("강말순씨의 연봉은: " + (int) (emp[2].sumsalary()));

        int salAverage = ((int) (
                (emp[0].sumsalary()) +
                (emp[1].sumsalary()) +
                (emp[2].sumsalary())));


        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("직원들의 연봉의 평균: " + (salAverage / 3));
        System.out.println();

    }

}
