package com.ohgiraffers.lamda.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Appliation {

    public static void main(String[] args) {
        Appliation app = new Appliation();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {

        Supplier<String> supplier = () -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:SSS"));
        System.out.println("1번 문제 출력 : " + supplier.get());

    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {

        Supplier<Set<Integer>> supplier = () -> {
            Set<Integer> lotto = new TreeSet<>();

            while (lotto.size() < 6) {
                int num = (int) (Math.random() * 45) + 1;
                lotto.add(num);
            }
            return lotto;
        };

        System.out.println("2번 문제 출력 : " + supplier.get());
    }
    /*
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     *
     */
    private void test3() {

        Consumer<Integer> consumer= (won) -> {
          double rate = 1350;
          double dollar = won / rate;

            System.out.println("3번 문제 출력 : \\ : " + won + ", $ : " + dollar );
        };
         consumer.accept(1000);
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {

        // <입력, 반환>
        Function<Integer, Double> function = (won) -> {
            double rate = 1350;
            double dollar = won / rate;
            System.out.println("4번 문제 출력 : \\: " + won + ", $ : " + dollar );
            return dollar;
        };
        double dollar = function.apply(1000);

    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */
    private void test5() {

        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        Predicate<String> result = str -> str.trim().length() == 0;

        for (String str : strList) {
            System.out.println("문자열의 길이는 0이 맞습니까? " + result.test(str) );
        }
    }
}
