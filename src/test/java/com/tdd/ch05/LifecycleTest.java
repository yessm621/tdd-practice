package com.tdd.ch05;

import org.junit.jupiter.api.*;

public class LifecycleTest {

    public LifecycleTest() {
        System.out.println("new LifecycleTest");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @Test
    void a() {
        System.out.println("A");
    }

    @Test
    void b() {
        System.out.println("B");
    }

    @DisplayName("테스트 하지 않음")
    @Disabled
    @Test
    void failMethod() {
        System.out.println("disabled test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }
}
