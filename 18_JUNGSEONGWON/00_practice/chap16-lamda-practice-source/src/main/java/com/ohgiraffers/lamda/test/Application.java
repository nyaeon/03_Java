package com.ohgiraffers.lamda.test;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.Supplier;

public class Application implements App {

    public static void main(String[] args) {
        Application app = new Application();

            app.test1();
            app.test2();
            app.test3();
            app.test4();
            app.test5();
    }

    @Override
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    /**
         * <pre>
         * @실습문제1
         * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
         * </pre>
         */
        private void test1() {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
            Supplier<String> sup = () -> LocalDateTime.now().format(formatter);
            System.out.println(sup.get());
        }
        /**
         * <pre>
         * @실습문제2
         * 로또를 생성하는 람다식을 작성하세요.
         * - 리턴타입 Set<Integer>
         * </pre>
         */
        private void test2() {
            Set<Integer> lotto = new HashSet<>();
            while (lotto.size() < 6) {
                int random = (int) (Math.random() * 45)+1;
                lotto.add(random);
            }
            System.out.println("lotto = " + lotto);
        }
        /*
         * @실습문제3
         * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
         * 현재 1달러는 1350원이다.
         * </pre>
         */
        private void test3() {
            IntConsumer intConsumer = won -> System.out.println("반환하신 금액은 " + won + " 원 입니다."
                        + "따라서 환율은 $ "  + (double)won/1350 + "입니다.");
            intConsumer.accept(4000);
        }
        /**
         * <pre>
         * @실습문제4
         * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
         * </pre>
         */
        private void test4() {
            Scanner sc = new Scanner(System.in);
            System.out.println("금액을 입력해주세요 : ");
            int won = sc.nextInt();
            IntToDoubleFunction function = x-> (double)x/1350;

            double dollar = function.applyAsDouble(won);
            System.out.println("환전 결과 : $" + dollar);
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
            boolean abc = strList.stream().noneMatch(str-> str.length() >= 0);
            System.out.println("[abc]의 길이는 0입니까? " + abc);
            boolean x = strList.stream().allMatch(str-> str.length() >= 0);
            System.out.println("[]의 길이는 0입니까? " + x);
            boolean y = strList.stream().noneMatch(str-> str.length() >= 0);
            System.out.println("[대한민국]의 길이는 0입니까? " + y);
            boolean z = strList.stream().allMatch(str-> str.length() >= 0);
            System.out.println("[]의 길이는 0입니까? " + z);


        }
    }
    /*
[수행결과]
            22:32:51
            22:32:51
     lotto = [10, 18, 26, 35, 39, 40]

    ￦ 3000 => ＄ 2.3076923076923075
            2.2222222222222223

            [abc]의 길이는 0입니까? false
            []의 길이는 0입니까? true
            [대한민국]의 길이는 0입니까? false
            [ ]의 길이는 0입니까? true

     */
