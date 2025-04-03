package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {
    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        StudentVO studentVO = new StudentVO(1, 2, "홍길동", 175.5, '남');

        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력
        studentVO.printInformation();
    }
}
