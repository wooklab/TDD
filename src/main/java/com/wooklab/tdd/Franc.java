package com.wooklab.tdd;

public class Franc extends Money {

    public Franc(int amount) {
        super.amount = amount;
    }

    @Override
    Money times(int multiplier) {
        return new Franc(super.amount * multiplier);
    }
}
