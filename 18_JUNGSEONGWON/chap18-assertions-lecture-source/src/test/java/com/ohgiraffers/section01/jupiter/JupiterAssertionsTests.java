package com.ohgiraffers.section01.jupiter;

import com.ohgiraffers.section01.jupiter.Calculator;
import com.ohgiraffers.section01.jupiter.NumberValidation;
import com.ohgiraffers.section01.jupiter.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* Junit5에서 제공하는 Assertions에 있는 메소드에 대해 이해하고 활용 할 수 있다.*/
class JupiterAssertionsTests { // 내부에서만 사용하는 용도로 접근제한자를 사용하지 않고 defualt로 둔다.

    /* 1.assertEquals : 예상 값과 실제 값의 일치 여부를 동일성으로 판단한다.*/
    @Test
    void testAssertEquals() {

        /* given */
        //테스트 값을 작성 시 필요한 값이 어떤 것들인 가를 작성하는 것
        int firstNum = 10;
        int secondNum = 20;
        int expectedNum = 29;
        /* when */
        // 실행을 한 다음에 결과값
        Calculator cal = new Calculator();
        int result = cal.plus(firstNum, secondNum);
        /* then */
        // 결과 값이 이런 식으로 나와야 한다는 것이다.
//        Assertions.assertEquals(expectedNum, result);
        Assertions.assertEquals(expectedNum, result, 1); // 1정도의 차이는 허용범위 안에 있다는 뜻
    }

    /* 2. assertNull : null 여부 테스트*/
    @Test
    @DisplayName("Null 여부 테스트") // 이름을 바꾸는 구문
    void testAssertNull() {
        String str = null;
        Assertions.assertNull(str);

        String str2 = "abc";
        Assertions.assertNull(str2);

    }

    /* assertAll :  한 번에 여러 검증을 수행 할 수 있는 메소드*/
    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트")
    void testAssertAll(){
        String firstName = "길동";
        String lastName = "홍";
        Person person = new Person(firstName, lastName);
        Assertions.assertAll(
                () -> Assertions.assertEquals(firstName, person.getFirstName()),
                 () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }
    @Test
    @DisplayName("exception 발생 테스트")
    void testAssertThrow(){
        /* given */
        int firstNum = 10;
        int secondNum = 0;
        /* when */
        /* then */
        NumberValidation validator = new NumberValidation();

        Exception exception = Assertions.assertThrows( // 밑의 구문의 코드가 안 나오는 경우 실패로 간주 한다.
                IllegalArgumentException.class, // 즉 0으로 나눌 수 없다는 구문이 나와야 성공으로 간주한다.
                () -> validator.checkDividableNumbers(firstNum, secondNum)
        );
        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(
                        IllegalArgumentException.class,exception
                ),
                () -> Assertions.assertEquals(
                        "0으로 나눌 수 없습니다.",exception.getMessage())
        );

    }
}