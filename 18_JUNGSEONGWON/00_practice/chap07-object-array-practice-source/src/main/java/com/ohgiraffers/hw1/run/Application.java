package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        // 3명의 직원의 연봉 평균을 구하여 출력
        EmployeeDTO[] emps = new EmployeeDTO[3];
        emps[0] = new EmployeeDTO();
        emps[1] = new EmployeeDTO(1,"홍길동",19,'남',"01022223333","서울 잠실");
        emps[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
        System.out.println("emp[0] : " + emps[0].information());
        System.out.println("emp[1] : " + emps[1].information());
        System.out.println("emp[2] : " + emps[2].information());
        System.out.println("=================================================================================================");
        emps[0] = new EmployeeDTO(0, "김말똥","영업부","팀장", 30, 'M',3000000,0.2, "01055559999", "전라도 광주");
        emps[1] = new EmployeeDTO(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
        System.out.println("emp[0] : " + emps[0].information());
        System.out.println("emp[1] : " + emps[1].information());
        System.out.println("=================================================================================================");
        System.out.println("김말똥의 연봉 : " + (emps[0].getSalary() + (emps[0].getSalary() * emps[0].getBounsPoint()))*12);
        System.out.println("홍길동의 연봉 : " + (emps[1].getSalary() + (emps[1].getSalary() * emps[1].getBounsPoint()))*12);
        System.out.println("강말순의 연봉 : " + (emps[2].getSalary() + (emps[2].getSalary() * emps[2].getBounsPoint()))*12);
        System.out.println("=================================================================================================");
        System.out.println("직원들의 연봉의 평균 : " +( ((emps[0].getSalary() + (emps[0].getSalary() * emps[0].getBounsPoint()))*12)
                                                    +((emps[1].getSalary() + (emps[1].getSalary() * emps[1].getBounsPoint()))*12)
                                                    +((emps[2].getSalary() + (emps[2].getSalary() * emps[2].getBounsPoint()))*12))/3);



    }

}
