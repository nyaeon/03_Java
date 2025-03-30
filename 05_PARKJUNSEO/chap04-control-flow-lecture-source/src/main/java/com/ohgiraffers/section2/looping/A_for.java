package com.ohgiraffers.section2.looping;

public class A_for {

    public void testSimpleForStatement() {

        // 1부터 10까지 1씩 증가시ㅣ면서 i값을 출력하는 기본 반복문
        // 동안 (1부터; 10까지; 1씩 증가){
        //  1부터 10까지 반복하며 출력
         // }
        int i = 1;
        for(; i <= 10; i++) {
            System.out.println(i);
        }
    }

//    public void test1() {
//        int i = 1;
//        for(; i <= 10; i++) {
//            System.out.println(i + "번째 학생의 이름을 입력해주세요.");
//            String student = sc.nextLine();
//            System.out.println(student);
//        }
//    }

    public void test2() {
        int i = 1;
        int sum = 0;
        for (; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }

    public void test3() {
        int rand = (int)(Math.random() * 6 + 5);
        int sum = 0;
        for (int i = 1; i <= rand; i++) {
            sum += i;
        }
        System.out.println("rand = " + rand);
        System.out.println("1부터 rand까지의 합은: "+ sum);
    }
}
