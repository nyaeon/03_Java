package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = {
            new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
            new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
            new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과"),
        };

        for (StudentDTO student : students) {
            System.out.println(student.information());
        }

        EmployeeDTO[] employees = new EmployeeDTO[10];
        int numEmp = 0;
        var br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < employees.length; i++) {
            if (!askContinue(i, br))
                break;

            var emp = new EmployeeDTO();
            emp.setName(readLine("name", br, s -> s));
            emp.setAge(readLine("age", br, Integer::parseInt));
            emp.setHeight(readLine("height", br, Double::parseDouble));
            emp.setWeight(readLine("weight", br, Double::parseDouble));
            emp.setSalary(readLine("salary", br, Integer::parseInt));
            emp.setDept(readLine("dept", br, s -> s));

            employees[i] = emp;
            numEmp = i + 1;
        }

        for (int i = 0; i < numEmp; i++) {
            System.out.println(employees[i].information());
        }
    }

    private static <T> T readLine(String label, BufferedReader br, Function<String, T> parser) {
        while (true) {
            try {
                System.out.print("Enter " + label + ": ");
                return parser.apply(br.readLine().trim());
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static boolean askContinue(int count, BufferedReader br) {
        while (true) {
            try {
                System.out.print("사원 정보를 계속 추가할까요? (현재 " + count + "개) y/n: ");
                var answer = Character.toLowerCase(br.readLine().charAt(0));
                if (answer == 'y') return true;
                if (answer == 'n') return false;
            } catch (IOException ignored) {
            }
        }
    }
}
