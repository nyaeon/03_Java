package com.ohgiraffers.lambda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
    public void test1() {
        Runnable r = () -> System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        r.run();

        Consumer<LocalTime> c = (time) -> System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        c.accept(LocalTime.now());
    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    public void test2() {
        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set = new TreeSet<>();
            while (set.size() < 6) {
                set.add((int)((Math.random() * 45) + 1));
            }
            return set;
        };
        System.out.println("lotto : " + lotto.get());
    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */
    private void test3() {
        Consumer<Integer> calc = (won) -> {
           double num1 = 1350;
           double num2 = won / num1;
            System.out.println("￦ " + won + " $ " + num2);
        };
        calc.accept(3000);
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        Function<Integer, Double> fn = (won) -> {
            double num1 = 1350;
            return won / num1;
        };
        double num2 = fn.apply(3000);
        System.out.println(num2);
    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국"," "}를 체크하세요.
     * </pre>
     */

    // 뭔소리인지 이해가 안된다 젠장......
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Predicate<String> isLen0 = str -> str.trim().length() == 0;
        for (String str : strList) {
            System.out.println("[" + str + "] 의 길이는 0입니까? " + isLen0.test(str));
        }
    }

}
