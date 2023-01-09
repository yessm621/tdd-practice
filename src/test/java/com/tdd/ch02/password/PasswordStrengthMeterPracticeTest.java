package com.tdd.ch02.password;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 암호 검사기
 * 규칙
 * - 길이가 8글자 이상
 * - 0 부터 9 사이의 숫자를 포함
 * - 대문자 포함
 * 3 규칙을 모두 만족하면 암호는 강함
 * 2 규칙을 만족하면 암호는 보통
 * 1 규칙 이하를 만족하면 암호는 약함
 * input: 암호 -> String
 * output: 암호 강도 (강함, 보통 약함) -> ENUM
 */
public class PasswordStrengthMeterPracticeTest {

    private PasswordStrengthMeter meter = new PasswordStrengthMeter();

    @Test
    @DisplayName("모든 규칙을 만족하면 암호의 강도는 강함")
    void all_rules_met_strong() {
        assertEquals(PasswordStrength.STRONG, meter.meter("abcD1234!@"));
    }

    @Test
    @DisplayName("두가지 규칙을 만족하고 8글자 이하인 암호의 강도는 보통")
    void two_rules_met_length() {
        assertEquals(PasswordStrength.NORMAL, meter.meter("abcD1!@"));

        assertEquals(PasswordStrength.NORMAL, meter.meter("abD12!@"));
    }

    @Test
    @DisplayName("두가지 규칙을 만족하고 숫자를 포함하지 않는 경우 암호의 강도는 보통")
    void two_rules_met_not_number() {
        assertEquals(PasswordStrength.NORMAL, meter.meter("abcDefgH!@"));
    }

    @Test
    @DisplayName("두가지 규칙을 만족하고 대문자를 포함하지 않는 경우 암호의 강도는 보통")
    void two_rules_met_not_upper() {
        assertEquals(PasswordStrength.NORMAL, meter.meter("abcdefg123!@"));
    }

    @Test
    @DisplayName("한가지 규칙을 만족하면 암호의 강도는 약함")
    void one_rules_met_weak() {
        assertEquals(PasswordStrength.WEAK, meter.meter("abcdefg!@"));
    }

    @Test
    @DisplayName("모든 규칙을 만족하지 않으면 암호의 강도는 약함")
    void all_rules_not_met_weak() {
        assertEquals(PasswordStrength.WEAK, meter.meter("abg!@"));
    }

    @Test
    @DisplayName("암호가 null 일 경우")
    void password_is_null() {
        assertEquals(PasswordStrength.INVALID, meter.meter(null));
    }

    @Test
    @DisplayName("암호가 빈 값일 경우")
    void password_is_empty() {
        assertEquals(PasswordStrength.INVALID, meter.meter(""));
    }
}
