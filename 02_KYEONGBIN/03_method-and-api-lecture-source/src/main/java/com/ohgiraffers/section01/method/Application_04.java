package com.ohgiraffers.section01.method;  // 패키지 선언 - 해당 클래스가 포함된 패키지를 정의

public class Application_04 {  // 클래스 선언: Application_04라는 클래스 정의

    public static void main(String[] args) {  // main() 메서드: 프로그램의 시작점, 실행되는 코드 블록

        // 객체 생성 후 non-static 메서드 호출
        // Application_04 클래스의 객체를 생성하려면 'new' 키워드를 사용합니다.
        // 클래스는 설계도와 같고, 객체는 그 설계도를 바탕으로 만들어진 실제 존재입니다.
        // 'app'은 객체를 참조하는 변수로, 이 객체는 testMethodA()와 같은 메서드를 실행할 수 있습니다.
        Application_04 app = new Application_04();  // Application_04 클래스의 인스턴스(객체) 생성
        app.testMethodA("Bini", 31, 'M');  // 생성된 객체를 통해 testMethodA()를 호출 (객체가 있어야 non-static 메서드를 호출 가능)
        // 위 코드에서는 "Bini", 31, 'M' 값을 전달하여 testMethodA() 메서드를 호출

        // 변수 선언 후 testMethodA() 메서드 호출
        // 이름, 나이, 성별을 변수에 저장한 후 메서드를 호출
        String name = "유관순";  // 이름 변수 (String 타입)
        int age = 33;            // 나이 변수 (int 타입)
        char gender = 'F';       // 성별 변수 (char 타입)
        app.testMethodA(name, age, gender);  // 변수에 저장된 값을 전달하여 메서드 호출 (객체를 통해)

    }  // main() 메서드 종료

    /***
     *  사용자의 이름, 나이, 성별을 출력하는 메서드
     * @param name 이름 (String)
     * @param age 나이 (int)
     * @param gender 성별 (char, final로 값 변경 불가)
     */
    public void testMethodA(String name, int age, final char gender) {  // testMethodA() 메서드 정의
        // testMethodA() 메서드는 사용자의 이름, 나이, 성별을 출력하는 기능을 합니다.
        // 매개변수는 이름(name), 나이(age), 성별(gender)입니다.
        // gender는 final로 선언되어 이 메서드 내에서는 값이 변경될 수 없습니다.
        System.out.println("Your name is " + name + " and age is " + age + " and gender is " + gender);
        // 위 출력문은 전달된 값(name, age, gender)을 출력합니다.
        // 예시: Your name is Bini and age is 31 and gender is M
    }

}  // Application_04 클래스 종료
