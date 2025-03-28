package com.ohgiraffers.section04.scanner;

import java.util.Scanner; // Scanner 클래스를 import하여 사용

public class Application_01 {
    public static void main(String[] args) {

        // 1. Scanner 설정방법
        System.out.println("hello");

        // Scanner 객체를 생성하여 사용자 입력을 받을 준비
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 문자열 입력을 받기
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // 한 줄 입력 받음 (공백 포함)
        System.out.println("Your name is " + name);

        // 정수값 입력받기
        System.out.println("나이를 입력하시오: ");
        int age = sc.nextInt();  // 정수 입력
        System.out.println("age is " + age);

        // 실수값 입력받기
        System.out.println("키를 입력하시오: ");
        double height = sc.nextDouble();  // 실수 입력
        System.out.println("height is " + height);

        // 논리형 입력받기
        System.out.println("true/false 값을 입력하시오: ");
        boolean isTrue = sc.nextBoolean();  // 논리값 입력
        System.out.println("isTrue is " + isTrue);

        // 개행문자 처리 (버퍼 정리)
        sc.nextLine(); // 이전 입력(nextInt(), nextDouble())에서 남은 개행문자 제거

        // 문자열 입력받기 (next()와 nextLine() 비교)
        System.out.println("Please enter your surname: ");
        String surname = sc.next();  // 공백 전까지 한 단어 입력
        System.out.println("surname is " + surname);

        sc.nextLine(); // next() 사용 후 남아 있는 개행문자 제거

        // 전체 문자열 입력받기 (공백 포함)
        System.out.println("주소를 입력하시오: ");
        String address = sc.nextLine();  // 전체 문장 입력
        System.out.println("address is " + address);

        // 문자 입력받기 (한 글자만 입력)
        System.out.println("다시 시작하시겠습니까? (Y/N): ");
        char ch = sc.next().charAt(0);  // 문자열의 첫 번째 문자만 가져옴
        System.out.println("You entered " + ch);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("The system will be restarted");
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("The system will not be restarted");
        }

        // Scanner 객체 닫기 (자원 해제)
        sc.close();
    }
}

/*
📌 Scanner 메서드 정리:

1. `Scanner sc = new Scanner(System.in);`
   - 사용자의 입력을 받기 위해 Scanner 객체를 생성

2. `sc.nextLine();`
   - 한 줄의 문자열을 입력받음 (공백 포함)

3. `sc.nextInt();`
   - 정수 입력 (버퍼에 개행문자가 남을 수 있음)

4. `sc.nextDouble();`
   - 실수 입력 (버퍼에 개행문자가 남을 수 있음)

5. `sc.nextBoolean();`
   - `true` 또는 `false` 입력 받기

6. `sc.next();`
   - 공백 전까지 한 단어 입력받기 (공백 포함된 문장을 입력받으려면 `nextLine()` 사용)

7. `sc.nextLine();`
   - 개행문자 포함하여 한 줄 입력받기 (공백 포함)

8. `sc.next().charAt(0);`
   - 문자열에서 첫 번째 문자만 가져오기 (단일 문자 입력)

9. `sc.close();`
   - 입력 종료 후 Scanner 자원 해제
*/
