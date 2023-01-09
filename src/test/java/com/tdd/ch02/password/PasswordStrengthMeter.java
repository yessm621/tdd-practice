package com.tdd.ch02.password;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String password) {

        if (password == null || password.length() < 1) {
            return PasswordStrength.INVALID;
        }

        int metCount = getMetCriteriaCounts(password);
        if (metCount == 2) return PasswordStrength.NORMAL;
        if (metCount <= 1) return PasswordStrength.WEAK;

        return PasswordStrength.STRONG;
    }

    private int getMetCriteriaCounts(String password) {
        int metCount = 0;
        if (password.length() >= 8) metCount++;
        if (meetsContainingNumberCriteria(password)) metCount++;
        if (meetsContainingUppercaseCriteria(password)) metCount++;

        return metCount;
    }

    private boolean meetsContainingNumberCriteria(String password) {
        for (char c : password.toCharArray()){
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    private boolean meetsContainingUppercaseCriteria(String password) {
        for (char c : password.toCharArray()){
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }
}
