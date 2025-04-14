package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.StudentDTO;

public class Application {

    public static void main(String[] args) {

        // 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
        StudentDTO[] student = new StudentDTO[3];

        // 아래의 사용데이터를 참고하여 3명의 객체 생성
        student[0] = new StudentDTO("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        student[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        student[2] = new StudentDTO("강개순", 23, 167.0, 45, 4, "정보통신공학과");

        // 이후에 객체를 반복문을 이용해 출력
        for (StudentDTO s : student) {
            System.out.println(s.information());
        }

    }
}
