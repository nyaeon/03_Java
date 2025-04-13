package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5_1();
        app.test5_2();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */

    // (매개변수) -> {실행할 코드}

    private void test1() {
        System.out.println("========== test1 ==========");
        // Runnable은 반환값이 없는 작업을 정의하는 함수형 인테페이스이며 run() 메서드를 통해 실행.
        // 함수형 인터페이스는 하나의 추상 메서드만을 가지는 인터페이스이다. () -> 매개변수 없는 간단한 작업을 수행. ()안에는 매개변수를 선언할 수 있다.
        Runnable printTime1 = () ->
                System.out.println("현재 시간 : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        printTime1.run();

        Consumer<LocalTime> printTime2 = (time) ->
                System.out.println("현재 시간 : " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        printTime2.accept(LocalTime.now());

        Runnable printTime3 = () -> {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println("현재 시간 : " + now.format(formatter));
        };
        // 위에 방법은 printTime1과 같은 방법이라 보면 됨. printTime1이 더 효율적임.
        printTime3.run();
    }

    /*
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {
        System.out.println("========== test2 ==========");
        // Supplier<Set<Integer>> : 입력 없이 결과로 Set<Integer>를 반환하는 함수형 인터페이스
        // TreeSet : 숫자를 자동으로 정렬하고, 같은 값이 중복되어 들어가는 것을 막습니다.
        // Set<Integer>는 정수를 저장할 수 있는 집합(Set)을 의미. 중복을 허용하지 않고 자동 정렬이 된다.
        Supplier<Set<Integer>> lotto1 = () -> {
            // TreeSet을 사용하면 자동으로 오름차순 정렬되며 데이터를 저장, 중복이 허용되지 않음
            Set<Integer> set = new TreeSet<>(); // TreeSet 객체 생성
            // set의 크기가 6이 될 때까지 반복, while ()조건 {조건이 참일 때 실행할 코드}
            while (set.size() < 6) {
                // Math.random()은 0.0이상 1.0미만의 실수를 반환
                // (Math.random() * 45)는 0.0이상 45.미만의 실수
                // + 1을 해서 1 이상 46 미만, 즉 1부터 45까지의 정수를 구한 후 int로 형변환
                set.add((int) (Math.random() * 45 + 1));
            }
            return set; // Supplier의 get() 메서드로 반환된다.
        };
        System.out.println("lotto1 = " + lotto1.get());

        Set<Integer> lotto2 = new Random().ints(1, 46) // 1이상 46미만(즉, 1~45)
                                          .distinct()// 중복된 숫자 제거
                                          .limit(6) // 6개의 숫자 선택. 즉, 스트림에서 처음 6개의 요소만 선택
                                          .boxed() // int값을 Integer로 박싱. int 스트림을 Integer 스트림으로 변환
                                          .collect(Collectors.toCollection(TreeSet::new)); // 결과를 정렬된 TreeSet으로 수집
        // 기본형을 객체로 다루기 위해 사용하는 클래스들을 래퍼 클래스(wrapper class)라 한다. 여기서 객체를 다루기 위해 Integer 스트림으로 변환
        System.out.println("lotto2 = " + lotto2);

        // 1부터 45까지의 숫자를 리스트로 생성
        List<Integer> numbers = IntStream.rangeClosed(1, 45)
                                         .boxed()
                                         .collect(Collectors.toList());
        // 리스트를 무작위로 섞기
        Collections.shuffle(numbers);
        // 섞인 리스트의 처음 6개를 TreeSet에 담아 정렬된 결과 얻기
        Set<Integer> lotto3 = new TreeSet<>(numbers.subList(0, 6));
        System.out.println("lotto3 = " + lotto3);
    }

    /**
    * <pre>
    * @실습문제3
    * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
    * 현재 1달러는 1350원이다.
    * </pre>
    */
    private void test3() {
        System.out.println("========== test3 ==========");
        // Consumer<Integer>는 결과를 반환하지 않는 함수형 인터페이스이다. accept()메서드 사용하여 값을 처리.
        Consumer<Integer> exchangeRate1 = won -> {
            double rate = 1350; // 1달러 1350원
            double dollar = won / rate; // 환율 구하기
            System.out.println("￦ " + won + " =>  ＄ " + dollar);
        };
        exchangeRate1.accept(3000); // 람다식 방식으로 계산 및 출력
    }

    /**
    * <pre>
    * @실습문제4
    * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
    * </pre>
    */
    private void test4() {
        System.out.println("========== test4 ==========");
        // Function은 자바의 함수형 인터페이스 중 하나
        // 입력값을 받아서 처리 후 결과를 반환
        // Function<T, R> : T는 입력 타입, R은 결과 타입
        Function<Integer, Double> exchangeRate = won -> {
            // won -> {} 람다식 사용
            // 결과적으로 환율을 구하기 때문에 double 사용
            // int로 사용해도 되지만 double로 형변환을 해줘야 한다.
//            int rate = 1350;
//            return (double) won / rate;
            double rate = 1350;
            return won / rate;
        }; // apply 메서드로 입력값을 처리하고 그 결과를 반환
        double dollar = exchangeRate.apply(3000); // Function은 apply() 메서드 사용
        System.out.println(dollar);
    }




    /**
    * <pre>
    * @실습문제5
    * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
    * 문자열리스트 {"abc", "", "대한민국","  ")를 체크하세요.
     * </pre>
     */
    private void test5_1() {
        System.out.println("========== test5_1 ==========");
        List<String> strList = Arrays.asList("abc", "", "대한민국", "  ");
        // Predicate는 조건을 확인하는 함수형 인터페이스. ture, false 값 반환
        Predicate<String> isLen0 = str -> str.trim().length() == 0;
        for (String str : strList) {
            System.out.println("[" + str + "]의 길이는 0입니까? " + isLen0.test(str));
        }
    }
    private void test5_2() {
        System.out.println("========== test5_2 ==========");
        List<String> strList = Arrays.asList("abc", "", "대한민국", "  ");
        Predicate<String> isLen0 = str -> str.trim().length() == 0;
        strList.stream()
                .forEach(str -> System.out.println("[" + str + "]의 길이는 0입니까? " + isLen0.test(str)));
    }
}

/*
[수행결과]
22:32:51
lotto = [10, 18, 26, 35, 39, 40]
￦ 3000 => ＄ 2.3076923076923075
2.2222222222222223
[abc]의 길이는 0입니까? false
[]의 길이는 0입니까? true
[대한민국]의 길이는 0입니까? false
[ ]의 길이는 0입니까? true
 */