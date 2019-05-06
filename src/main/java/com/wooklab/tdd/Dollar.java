package com.wooklab.tdd;

public class Dollar extends Money {
    public Dollar(int amount) {
        super.amount = amount;
    }


    @Override
    Money times(int multiplier) {
        return new Dollar(super.amount * multiplier);
    }
}
