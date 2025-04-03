package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {
    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력
        StudentVO sd = new StudentVO();
        sd.setGrade(1);
        sd.setClassroom(2);
        sd.setName("홍길동");
        sd.setHeight(175.5);
        sd.setGender('남');


        System.out.println("학년 : " + sd.getGrade() );
        System.out.println("반 : " + sd.getClassroom() );
        System.out.println("이름 : " + sd.getName() );
        System.out.println("키 : " + sd.getHeight() );
        System.out.println("성별 : " + sd.getGender() );
    }
}
