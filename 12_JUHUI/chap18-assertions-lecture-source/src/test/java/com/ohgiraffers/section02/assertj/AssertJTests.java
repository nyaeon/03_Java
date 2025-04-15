package com.ohgiraffers.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/* Test 3rd party lib 중 AssertJ의 사용법에 대해서 이해할 수 있다. */
class AssertJTests {
    /* 1. 문자열 테스트 */
    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation() {
        // given
        String expected = "hello world";
        // when
        String actual = new String(expected);
        // then
        assertEquals(expected, actual);
        Assertions.assertThat(actual)
                .isNotEmpty()//비어있는지
                .isNotBlank()// 빈칸인지
                .contains("hello")//hellow를 포함하는지
                .startsWith("h") //h로 시작하는지
                .endsWith("d") //d로 끝나는지
                .isEqualTo(expected);//같은지 비교, 값비교도 가능함.
    }

    /* 2. 숫자 테스트 */
    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation() {
        double pi = Math.PI;//Math에서 PI라는 상수값 가져온 것임
        Double actual = Double.valueOf(pi); // 오토박싱
        Assertions.assertThat(actual)
                .isPositive()// 양수입니까?
                .isGreaterThan(3)//이 값보다 더 크니?
                .isLessThan(4) //작아요?
                .isEqualTo(Math.PI);
    }

    /* 3. 날짜 테스트 하기 */
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthday = "2000-06-25T16:49:00.000";//년월일시분초마이크로
        LocalDateTime birth = LocalDateTime.parse(birthday);

        Assertions.assertThat(birth)
                .hasYear(2000)
                .hasMonthValue(6)
                .hasMonth(Month.JUNE)
                .hasDayOfMonth(25)
                .isBetween("2000-01-01T16:49:00.000","2000-12-25T16:49:00.000")
                .isBefore(LocalDateTime.now());//지금보다 이전이니?
    }

    /* 4. 예외 테스트 */
    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation() {
        // Throwable은 exception보다 상위
        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
                    throw new IllegalArgumentException("잘못된 파라미터를 입력하였습니다.");
        });

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)//이 클래스랑 타입이 같은지
                .hasMessageContaining("파라미터");//메세지에 대한 내용이 "파라미터"가 있는지
    }

    /* 5. filter를 이용한 단정문 테스트 */
    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        Member member1 = new Member(1,"usero1","홍길동",16);
        Member member2 = new Member(2,"usero2","이순신",20);
        Member member3 = new Member(3,"usero3","신사임당",40);
        List<Member> members = Arrays.asList(member1, member2, member3);

        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 19)
                .containsOnly(member2,member3)
                .filteredOn("age",20);
    }
}