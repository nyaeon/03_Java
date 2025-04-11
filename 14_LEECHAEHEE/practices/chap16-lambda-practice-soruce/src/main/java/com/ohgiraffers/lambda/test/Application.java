package com.ohgiraffers.lambda.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
       Application app = new Application();
       app.test1();
       app.test2();
       app.test3();
//       app.test4();
//       app.test5();
    }
    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {
        Supplier supplier = () -> LocalTime.now();
        System.out.println(supplier.get());
    }
    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {
        Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                IntSupplier intSupplier = () -> (int) (Math.random() * 45) + 1;
                lotto.add(intSupplier.getAsInt());
            }
        System.out.println(lotto);
    }
/**
 * <pre>
 *     * @실습문제3
 * * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
 * * 현재 1달러는 1350원이다.
 * * </pre>
 * */
private void test3() {
    Consumer<Integer> calc = won -> {
        double dollar = won / 1350;
        System.out.println(won + "원 => " + dollar + "달러");
    };
    calc.accept(3000);
}
    private void test4() {
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
    }
}
/*[수행결과]
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

