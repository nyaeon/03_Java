package com.ohgiraffers.homework.lamda;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    Supplier<String> time = () ->
            LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
    System.out.println(time.get());
  // List<Integer> dataList = new ArrayList<>(
  //         (Collection) new Date("HH:mm:ss"));
  // System.out.println(dataList);
  //  Date date = new Date();
  //  System.out.println(date);
 //  List<Integer> date = new ArrayList<>(
 //          (Collection) new Date("HH:mm:ss.SSS")
 //  );
 //  System.out.println(date);
}

/**
 * <pre>
 * @실습문제2
 * 로또를 생성하는 람다식을 작성하세요.
 * - 리턴타입 Set<Integer>
 * </pre>
 */
private void test2() {
    Supplier<Set<Integer>> stream = () -> {
        Set<Integer> set = new TreeSet<>();
        while (set.size()< 6) {
     set.add((int)(Math.random()*45 +1));
    }
    return set;
    };
        System.out.println(stream.get());

}
/*
 * @실습문제3
 * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
 * 현재 1달러는 1350원이다.
 * </pre>
 */
private void test3() {
    Consumer<Integer> numberConsumer = won -> {
        double rate = 1300;
        double dollar =  won/ rate;
        System.out.println("환산 : " + dollar);
    };
  Scanner scanner = new Scanner(System.in);
  System.out.print("금액 입력 : ");
  double input = scanner.nextDouble();
    numberConsumer.accept((int) input);
}
/**
 * <pre>
 * @실습문제4
 * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
 * public interface Function<T, R> {
 *     R apply(T t);
 * </pre>
 */
private void test4() {
  //  Consumer<Integer,double>
    Function<Integer,Double> number = won ->  won /1300.0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("금액 입력 : ");
    int input = scanner.nextInt();
//    numberConsumer.accept(input);
    double dollar = number.apply(input);
    System.out.println("환산 : " + dollar);
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
    strList.forEach(str -> {Boolean isEmpty = str.length() == 0;
        System.out.println("[" + str+"]의 길이는 0인가?"+isEmpty);});
  //  if (strList.contains(strList.get(0))) {
  //      strList.remove(0);
  //  }

}
}