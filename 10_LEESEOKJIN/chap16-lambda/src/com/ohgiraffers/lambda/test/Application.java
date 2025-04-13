package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        var app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    // 현재시각 출력
    private void test1() {
        Supplier<String> currentTime = () -> LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));

        System.out.println("currentTime = " + currentTime.get());
    }

    // 로또 생성
    private void test2() {
        Supplier<Set<Integer>> lotto = () ->
                new Random()
                        .ints(1, 46)
                        .distinct()
                        .limit(6)
                        .boxed()
                        .collect(Collectors.toSet());

        System.out.println("lotto = " + lotto.get());
    }

    // 환율계산
    private void test3() {
        UnaryOperator<Double> toDollar = won -> won / 1435.36;
        final double won = 270000;
        System.out.printf("￦%,.0f = $%,.2f\n", won, toDollar.apply(won));
    }

    private void test4() {
        Function<Double, Double> toDollar = won -> won / 1435.36;
        final double won = 5280000;
        System.out.printf("￦%,.0f = $%,.2f\n", won, toDollar.apply(won));
    }

    // 공백을 제외한 문자열의 길이가 0인지 체크
    private void test5() {
        var strList = List.of("abc", "", "대한민국", "   ");
        Predicate<String> isBlank = s -> s.trim().isEmpty();

        for (String str : strList) {
            System.out.println("isBlank(\"" + str + "\"): " + isBlank.test(str));
        }
    }
}
