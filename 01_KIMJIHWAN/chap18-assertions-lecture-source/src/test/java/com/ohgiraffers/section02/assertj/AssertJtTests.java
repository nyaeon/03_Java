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

class AssertJtTests {
    /* 문자열 테스트 */
    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation() {

        // given
        String expected = "hello world";

        // when
        String actual = new String(expected);

        // then
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .startsWith("h")
                .endsWith("d")
                .isEqualTo(expected);
    }

    /* 2. 숫자테스트 */
    @Test
    @DisplayName("숫자 테스트 하기")
    void testStringValidation2() {
        Double pi = Math.PI;
        Double actual = Double.valueOf(pi);

        Assertions.assertThat(actual)
                .isNegative()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    /* 3. 날짜 테스트 하기 */
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthday = "2000-06-25T16:49:00.000";
        LocalDateTime birth = LocalDateTime.parse(birthday);

        Assertions.assertThat(birth)
                .hasYear(2000)
                .hasMonthValue(6)
                .hasMonth(Month.JUNE)
                .hasDayOfMonth(25)
                .isBetween("2000-01-01T16:49:00.000", "2000-12-25T16:49:00.000")
                .isBefore(LocalDateTime.now());
    }

    /* 4. 예외 테스트 */
    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation() {

        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
                    throw new IllegalArgumentException("잘못된 파라미터를 입력하였습니다.");
                });


        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터");
    }

    /* 5. filter를 이용한 단정문 테스트 */
    @Test
    @DisplayName("filltering assertions 테스트")
    void testFilteringAssertions() {
        new Member(1, "user01", "홍길동", 16);
        new Member(2, "user02", "이순신", 20);
        new Member(3, "user03", "신사임당", 40);

        List<Member> members = Arrays.asList(member1, member2, member3);

        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 19)
                .containsOnly(member2, member3)
                .filteredOn("age", 20);
    }
}