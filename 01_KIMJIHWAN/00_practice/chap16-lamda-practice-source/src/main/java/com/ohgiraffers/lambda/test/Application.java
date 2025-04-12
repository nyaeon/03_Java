package com.ohgiraffers.lambda.test;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
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
            Runnable dateTime = () ->
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
            dateTime.run();

//            Supplier<DateTimeFormatter> a = () -> DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
//            System.out.println(a.get().LocalDateTime.now().format());
        }

        /**
         * <pre>
         * @실습문제2
         * 로또를 생성하는 람다식을 작성하세요.
         * - 리턴타입 Set<Integer>
         * </pre>
         */
        private void test2() {
            Supplier<Set<Integer>> lotto = () -> {
                Set<Integer> set = new TreeSet<>();
                while (set.size() < 6) {
                    set.add((int) (Math.random() * 45 + 1));
                }
                return set;
            };
            System.out.println(lotto.get());
        }
            // 중복 제네릭을
            // Set은 컬렉션(Collection) 이라서 .size() 메서드 사용
            // TreeSet을 사용하는 이유 : set은 중복 제거 / treeset은 자동 정렬

        /**
         * <pre>
         *    * @실습문제3
         * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
         * 현재 1달러는 1350원이다.
         * </pre>
         */
        private void test3() {
            Consumer<Integer> dolor = (won) -> {
                int num1 = 1350;
                double num2 = won/num1;
                System.out.println(num2);
            };
            dolor.accept(3000);
        }

        /**
         * <pre>
         * @실습문제4
         * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
         * </pre>
         */
        private void test4() {
            Function<Integer, Double> tr2 = (won1) -> {
                int num3 = 1350;
                return (double) won1 / num3;
            };
            System.out.println(tr2.apply(1350));
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
            Predicate<String> isLen0 = str -> str.trim().length() == 0;
            for (String str : strList) {
                System.out.println("[" + str + "]의 길이는 0입니까? " + isLen0.test(str));
            }
        }

        // trim() : String 양쪽 공백 제거
        // forEach는 List, Set 등 스트림에만 사용 가능

}
