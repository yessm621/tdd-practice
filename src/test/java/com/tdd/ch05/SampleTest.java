package com.tdd.ch05;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    void test() {
        LocalDate dateTime1 = LocalDate.now();
        LocalDate dateTime2 = LocalDate.now();
        assertEquals(dateTime1, dateTime2);

        assertNotSame(dateTime1, dateTime2);

        assertAll(
                () -> assertEquals(3, 5/2),
                () -> assertEquals(4, 2*2),
                () -> assertEquals(6, 11/2)
        );
    }
}
