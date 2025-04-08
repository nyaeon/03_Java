package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 생성 후 출력
        EmployeeDTO[] empArr = new EmployeeDTO[3]; // 객체배열 크기 3인 객체 생성
        empArr[0] = new EmployeeDTO();
        empArr[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        empArr[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < empArr.length; i++) {
            System.out.println("emp [" + i + "] : " + empArr[i].information());
        }

        // for문 사용하는게 더 간편한 방법
//        System.out.println("emp[0] : " + emp[0].information());
//        System.out.println("emp[1] : " + emp[1].information());
//        System.out.println("emp[2] : " + emp[2].information());

        System.out.println("=========================================================================");

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력(getters, setters 필요)

        // emp[0] 필드 변경
        empArr[0].setEmpNo(0);
        empArr[0].setEmpName("김말똥");
        empArr[0].setDept("영업부");
        empArr[0].setJob("팀장");
        empArr[0].setAge(30);
        empArr[0].setGender('M');
        empArr[0].setSalary(3000000);
        empArr[0].setBonusPoint(0.2);
        empArr[0].setPhone("01055559999");
        empArr[0].setAddress("전라도 광주");

        // emp[1] 필드 변경
        empArr[1].setDept("기획부");
        empArr[1].setJob("부장");
        empArr[1].setSalary(4000000);
        empArr[1].setBonusPoint(0.3);

        // 변경된 값 출력
        System.out.println("emp[0] : " + empArr[0].information());
        System.out.println("emp[1] : " + empArr[1].information());

        System.out.println("=========================================================================");

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        // 연봉 = salary + (salary * bonusPoint)) * 12

        int sum = 0;
        for (int i = 0; i < empArr.length; i++) {
            EmployeeDTO emp = empArr[i]; // 인덱스를 사용하여 배열의 각 요소에 접근
            double annualincome = emp.getSalary() * 12 + (emp.getSalary() * emp.getBonusPoint() * 12);
            System.out.println(emp.getEmpName() + "의 연봉 : " + (int) annualincome + "원"); // 연봉 출력

            sum += annualincome;
        }

        System.out.println("=========================================================================");

        // 3명의 직원의 연봉 평균을 구하여 출력
        System.out.println("직원들의 연봉의 평균 : " + sum / empArr.length + "원");
    }
}
