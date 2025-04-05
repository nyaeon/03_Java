package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        var students = new StudentDTO[10];
        int count = 0;

        var br = new BufferedReader(new InputStreamReader(System.in));
        while (count < students.length) {
            var student = new StudentDTO();
            student.setGrade(readLine("학년", br, Integer::parseInt));
            student.setClassroom(readLine("반", br, Integer::parseInt));
            student.setName(readLine("이름", br, s -> s));
            student.setKor(readLine("국어", br, Integer::parseInt));
            student.setEng(readLine("영어", br, Integer::parseInt));
            student.setMath(readLine("수학", br, Integer::parseInt));

            students[count++] = student;

            if (!askContinue(count, br))
                break;
        }

        for (int i = 0; i < count; i++) {
            var student = students[i];
            var kor = student.getKor();
            var eng = student.getEng();
            var math = student.getMath();
            var avg = (kor + eng + math) / 3;
            System.out.println(student.information() + ", 평균점수: " + avg);
        }
    }

    private static <T> T readLine(String label, BufferedReader br, Function<String, T> parser) {
        while (true) {
            try {
                System.out.print(label + ": ");
                return parser.apply(br.readLine().trim());
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static boolean askContinue(int count, BufferedReader br) {
        while (true) {
            try {
                System.out.print("계속 추가할까요? (현재 " + count + "개) y/n: ");
                var answer = Character.toLowerCase(br.readLine().charAt(0));
                if (answer == 'y') return true;
                if (answer == 'n') return false;
            } catch (IOException ignored) {
            }
        }
    }
}
