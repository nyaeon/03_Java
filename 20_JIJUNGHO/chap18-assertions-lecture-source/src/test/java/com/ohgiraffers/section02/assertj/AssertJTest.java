package com.ohgiraffers.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/* Test 3rd party lib 중 AssertJ의 사용법에 대해서 이해할 수 있다. */

class AssertJTest {

    // 1. 문자열 테스트
    @Test
    @DisplayName("문자열 테스트")
    void testStringValidation() {

        // given
        String expected = "hello world";

        // when
        String actual = new String("hello world");

        // then
        Assertions.assertThat(actual)
                .isNotEmpty() // 비어있는지 확인
                .isNotBlank() // 공백 확인
                .contains("hello") // 해당 값을 포함하고 있는지 확인
                .startsWith("h") // 해당 값으로 시작하는지 확인
                .endsWith("d")// 해당 값으로 끝나는지 확인
                .isEqualTo(expected); // 값 비교
    }

    // 2. 숫자 테스트
    @Test
    @DisplayName("숫자 테스트")
    void testIntegerValidation() {
        double pi = Math.PI;
        Double acutal = Double.valueOf(pi);

        Assertions.assertThat(acutal)
                .isPositive() // 양수 인지 확인
                .isNegative() // 음수 인지 확인
                .isGreaterThan(3) // 해당 값보다 더 큰지 확인
                .isLessThan(4) // 해당 값보다 작은지 확인
                .isEqualTo(Math.PI); // 값이 같은지 확인
    }

    // 3. 날짜 테스트
    @Test
    @DisplayName("날짜 테스트")
    void testLocalDateTimeValidation() {
        String birthDay = "1996-09-04T20:30:20.000";
        LocalDateTime birth = LocalDateTime.parse(birthDay);

        Assertions.assertThat(birth)
                .hasYear(1996) // 해당 값과 연도가 같은지 확인
                .hasMonthValue(9) // 해당 값과 월이 같은지 확인
                .hasDayOfMonth(4)
                .isBetween("1996-09-04T20:30:20.000", "1996-12-04T20:30:20.000") // 해당 값 사이에 있는지 확인
                .isBefore(LocalDateTime.now()); // 해당 값보다 이전 날짜인지 확인
    }

    // 4. 예외 테스트
    @Test
    @DisplayName("예외 테스트")
    void testExceptionValidation() {

        Throwable thrown = AssertionsForClassTypes.catchThrowable(
                () -> {
                    throw new IllegalArgumentException("잘못된 파라미터를 입력하였습니다.");
                }
        );

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터"); // 메시지에 해당 값이 들어있는지 확인
    }

    // 5. filter를 이용한 단정문 테스트
    @Test
    @DisplayName("필터링 테스트")
    void testFileterAssertions() {
        Member member1 = new Member(1, "user01", "홍길동", 16);
        Member member2 = new Member(2, "user02", "지정호", 30);
        Member member3 = new Member(3, "user03", "이순신", 78);
        List<Member> members = Arrays.asList(member1, member2, member3);

        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 18) // 조건이 맞는지 확인
                .containsOnly(member2, member3) // 해당 값을 포함하는 지 확인
                .filteredOn("age", 30);

    }

}