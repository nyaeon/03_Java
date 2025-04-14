package com.ohgiraffers.section01.lifecycle;

import org.junit.jupiter.api.*;

/* 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 사용할 수 있다. */
class LifeCycleAnnotationsTests {

    /* 테스트 수행 전 필요한 자원을 설정하는 역할의 메소드 */
    @BeforeAll
    static void beforeAll() { // 모든 시작에 다 관여할 건데 딱 한 번만 실행
        System.out.println("before all 동작");
    }
    @BeforeEach
    void beforeEach() { // 실행 전에 각각 동작
        System.out.println("before each 동작");
    }

    @AfterAll
    static void afterAll() { // 끝났을 때 한 번 동작
        System.out.println("after all 동작");
    }

    @AfterEach
    void afterEach() { // 끝나면 한 번씩 동작
        System.out.println("after each 동작");
    }

    @Test
    void test1() {
        System.out.println("after each 동작");
    }

    @Test
    void test2() {
        System.out.println("테스트 코드 2");
    }
}
