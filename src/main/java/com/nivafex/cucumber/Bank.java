package com.nivafex.cucumber;

/**
 * Created by Maksim Ruts on 10/20/2016.
 */
public class Bank {
    private double cash;

    public Bank(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void withdraw(double val) {
        cash -= val;
    }
}
