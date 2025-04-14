package com.ohgiraffers.lambda.test;

import java.security.PrivilegedAction;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
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
        Consumer<LocalDateTime> consumer = (ldt) -> {
            System.out.println(ldt.toLocalTime());
        };
        consumer.accept(LocalDateTime.now());
    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {
        Supplier<Set<Integer>> setSupplier = () -> {
            Set<Integer> lotto = new HashSet<>();
            IntSupplier is = () -> (int) (Math.random() * 45) + 1;
            while (lotto.size() < 6) {
                lotto.add(is.getAsInt());
            }
            return lotto;
        };

        Set<Integer> result = setSupplier.get();
        System.out.println("lotto = " + result.stream().sorted().toList());
        // lotto = [10, 18, 26, 35, 39, 40]
    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */
    private void test3() {
        Consumer<Integer> consumer = (krw) -> {
            System.out.println("￦ " + krw + " => ＄ " + (krw / 1350.0));
        };
        consumer.accept(3000);
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        Function<Integer, Double> function = (krw) -> (double) krw / 1350;

        int krw = 3000;
        double usd = function.apply(krw);
        System.out.println("￦ " + krw + " => ＄ " + usd);
    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국"," "}를 체크하세요.
     * </pre>
     */
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Function<String, Boolean> function = str -> str.trim().isEmpty();

        for (String str : strList) {
            System.out.println("[" + str + "]" + "의 길이는 0입니까? " + function.apply(str));
        }
    }
}