package com.ohgiraffers.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* JUnit5에서 제공하는 Assertions에 있는 메소드에 대해 이해하고 활용할 수 있다. */
class JupiterAssertionsTests {

    /* 1. assertEquals 메소드 : 예상값과 실제값의 일치 여부를 동일성으로 판단한다. */
    @Test
    void testAssertEquals() {

        /* given : 테스트 필요한 값은 무엇인지 */
        int firstNum = 10;
        int secondNum = 20;
        int expectedNum = 30;
        /* when */
        Calculator calc = new Calculator();
        int result = calc.plus(firstNum, secondNum);
        /* then : 결과 */
        Assertions.assertEquals(expectedNum, result);
//        Assertions.assertEquals(expectedNum, result,1);
    }

    /* 2. assertNull : null 여부 테스트 */
    @Test // test하고 싶으면 어노테이션 달아줘야함.
    @DisplayName("Null 여부 테스트")
    void testAssertNULL() {
        String str = null;
        Assertions.assertNull(str);

//        String str2 = "hello world";
//        Assertions.assertNull(str2); // 오류가 남. 널이 아니니까
    }

    /* 3. assertAll : 한 번에 여러 검증을 수행할 수 있는 메소드 */
    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트")
    void testAssertAll() {

        String firstName = "길동";
        String lastName = "홍";
        Person person = new Person(firstName, lastName);
        Assertions.assertAll(
                () -> Assertions.assertEquals(firstName,person.getFirstName()),
                () -> Assertions.assertEquals(lastName,person.getLastName())
        );

    }

    @Test
    @DisplayName("exception 발생 테스트")
    void testAssertThrow() {
        // give
        int firstNum = 10;
        int secondNum = 0;
        // when
        // then
        NumberValidation validator = new NumberValidation();

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> validator.checkDividableNumber(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(
                        IllegalArgumentException.class, exception
                ),
                () -> Assertions.assertEquals(
                        "0으로 나눌 수 없습니다.",
                        exception.getMessage()
                )
        );
    }

}