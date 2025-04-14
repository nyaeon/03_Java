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
    void tdstStringValidation() {

        //given
        String expected = "LG TWINS";
        //when
        String actual = new String(expected);
        //then
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("L")
                .startsWith("L")
                .endsWith("S")
                .isEqualTo(expected);
    }

    /* 2. 숫자테스트 */
    @Test
    @DisplayName("숫자를 테스트 하기")
    void testIntegerValidation() {
        double pi = Math.PI;
        Double actual = Double.valueOf(pi);    // 오토박싱

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(3.17)
                .isEqualTo(pi);
    }

    /* 3. 날짜 테스트 하기 */
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthDay = "2000-06-25T16:49:00.000";
        LocalDateTime birth = LocalDateTime.parse(birthDay);

        Assertions.assertThat(birth)
                .hasYear(2000)
                .hasMonth(Month.JUNE)        // SELF라는 특이한 타입
                .hasMonthValue(6)    // 얘는 날짜 타입
                .hasDayOfMonth(16)
                .isBetween("2000-01-25T16:49:00.000" , "2000-12-25T16:49:00.000")
                .isBefore(LocalDateTime.now());
    }

    /* 4. 예외 테스트 */
    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation(){

        Throwable thrown = AssertionsForClassTypes.catchThrowable(
                () -> {
                    throw new IllegalArgumentException("잘못된 파라이터를 입력하였습니다.");

        });

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터");
    }

    /* 5. filter를 이용한 단정문 테스트 */
    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        List<Member> members = Arrays.asList(
                Member member1 = new Member(1, "user01", "용택신", 33);
                Member member2 = new Member(2, "user02", "노송", 41);
                Member member3 = new Member(3, "user03", "야생마", 47);
                Member member4 = new Member(4, "user04", "악마", 51);
                Member member5 = new Member(5, "user05", "적토마", 9);
                List<Member> members = Arrays.asList(member1, member2, member3, member4, member5);

                Assertions.assertThat(members);

        );

        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 30);

    }
}