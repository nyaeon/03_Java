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

//App 클래스 정의 - 여기서 test1 ~ 5까지 메소드 구현
public class App {
    @FunctionalInterface
    interface CurrentTimeFormatter {
        void printCurrentTime();
    }

    // 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
    public void test1() {
        // 내가 쓴 방법 1
//        CurrentTimeFormatter formatter = () -> {
//            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
//            System.out.println("현재 시각 :" + sdf.format(new Date()));
//        };

        // 강사님 방법. 수업 내용 활용한 방법임
        Runnable now = () -> System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        now.run();

        Consumer<LocalTime> now2 = (time) -> System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        now2.accept(LocalTime.now());
    }

    // 로또를 생성하는 람다식을 작성하세요.
    public void test2() {
        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set = new TreeSet<>();
            while (set.size() < 6) {
                set.add((int) (Math.random() * 45 + 1));
            }
            return set;
        };
        System.out.println("lotto: " + lotto.get());
    }

    // 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
    //현재 1달러는 1350원이다.
    public void test3() {
        Consumer<Integer> calc = won -> {
            double rate = 1350;
            double dollar = won / rate;
            System.out.println("￦ : " + won + " => $ " + dollar);
        };
        calc.accept(3000);
    }

    // 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
    public void test4() {
        Function<Integer, Double> calc = won -> {
            double rate = 1350;
            return won / rate;
        };
        double dollar = calc.apply(3000);
        System.out.println(dollar);
    }

    // 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
    // 문자열리스트 {"abc","","대한민국","   "}를 체크하세요
    public void test5() {
       List<String> strList = Arrays.asList("abc","","대한민국","   ");
        Predicate<String> isLen0 = str -> str.trim().length() == 0;//이 조건이 맞는다면 이걸 적용할거야
        for (String str : strList) {
            System.out.println("[" + str + "]의 길이는 0입니까? " + isLen0.test(str));
        }
    }
}
