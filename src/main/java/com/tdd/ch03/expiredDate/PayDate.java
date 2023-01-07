package com.tdd.ch03.expiredDate;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class PayDate {

    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    public PayDate() {
    }

    public PayDate(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }
}
