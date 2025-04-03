package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] sd = new StudentDTO[3];
        EmployeeDTO[] ed = new EmployeeDTO[10];

        sd[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        sd[1] =  new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        sd[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");
        for(StudentDTO s : sd){
            System.out.println(s.information());
        }
        System.out.println("========================ED 입력==========================");
        int cnt = 0;
    while(true){

        String name = sc.nextLine();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        int salary = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        ed[cnt] = new EmployeeDTO(name, age, height, weight, salary, dept);
        cnt++;
        char check = sc.next().charAt(0);
        sc.nextLine();
        if(check != 'y' && check != 'Y'){
            break;
        }
    }
    for(int i=0;i<cnt;i++){
        System.out.println(ed[i].information());
    }

    }
}
