package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] ed = new EmployeeDTO[3];
        ed[0] = new EmployeeDTO();
        ed[1] = new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울 잠실");
        ed[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
        for(int i = 0 ; i < ed.length ; i++){
            System.out.println(ed[i].information());
        }
        System.out.println("===========================================================================");
        ed[0] = new EmployeeDTO(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
       ed[1].setDept("기획부");
       ed[1].setJob("부장");
       ed[1].setSalary(4000000);
       ed[1].setBonusPoint(0.3);
        System.out.println(ed[0].information());
        System.out.println(ed[1].information());
        System.out.println("===========================================================================");
        int sum=0;
        for(int i = 0 ; i < ed.length ; i++){
            int sal=ed[i].getSalary();
            double bonus=ed[i].getBonusPoint();
            int end =(int )(((sal*bonus)+sal)*12);
            sum+=end;
            System.out.println(ed[i].getEmpName()+"의 연봉 : "+end+"원");
        }
        System.out.println("===========================================================================");
        System.out.println("직원들의 연봉의 평균 : "+ sum/3+"원");
    }
}
