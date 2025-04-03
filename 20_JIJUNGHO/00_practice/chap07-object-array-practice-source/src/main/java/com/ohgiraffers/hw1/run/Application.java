package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] dto1 = new EmployeeDTO[3];
        dto1[0] = new EmployeeDTO();
        System.out.println("emp[0] : " + dto1[0].infomation());
        dto1[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        System.out.println("emp[1] : " + dto1[1].infomation());
        dto1[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println("emp[2] : " + dto1[2].infomation());

        System.out.println("==========================================================================================================================================");
        dto1[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        System.out.println("emp[0] : " + dto1[0].infomation());
        dto1[1] = new EmployeeDTO( 1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println("emp[0] : " + dto1[1].infomation());

        System.out.println("==========================================================================================================================================");
        System.out.println("김말똥의 연봉 : " + (int)dto1[0].getSalary() + "원");
        System.out.println("홍길동의 연봉 : " + (int)dto1[1].getSalary() + "원");
        System.out.println("강말순의 연봉 : " + (int)dto1[2].getSalary() + "원");
        System.out.println("==========================================================================================================================================");

        int salaryAgv = ((int)dto1[0].getSalary() + (int)dto1[1].getSalary() + (int)dto1[2].getSalary()) / 3;
        System.out.println("직원들의 평균 연봉 : " + salaryAgv + "원");

    }
}
