package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];

        emp[0] = new EmployeeDTO();
        System.out.println("emp[0] : " + emp[0].Information());
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        System.out.println("emp[1] : " + emp[1].Information());
        emp[2] = new EmployeeDTO(2, "홍길동", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println("emp[2] : " + emp[2].Information());

        System.out.println("==============================================================================================================================================================");
        EmployeeDTO[] emp2 = new EmployeeDTO[2];
        emp2[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        System.out.println("emp[0] : " + emp2[0].Information());
        emp2[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println("emp[1] : " + emp2[1].Information());

        System.out.println("==============================================================================================================================================================");
        EmployeeDTO[] emp3 = new EmployeeDTO[3];

        emp3[0] = new EmployeeDTO();
        emp3[1] = new EmployeeDTO();
        emp3[2] = new EmployeeDTO();
        for (int i = 0; i < emp.length; i++) {
            int salary = emp[i].getSalary();
            double bonusPoint = emp[i].getBonusPoint();
            double sum = (salary + (salary * bonusPoint)) * 12 ;
            System.out.println("김말똥의 연봉 : " + emp[i].getSalary());
        }

//        (salary + (salary * bonusPoint)) * 12 => 연봉

    }
}
