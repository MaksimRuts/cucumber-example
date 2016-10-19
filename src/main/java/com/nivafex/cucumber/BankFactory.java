package com.nivafex.cucumber;

import org.springframework.stereotype.Component;

/**
 * Created by Maksim Ruts on 10/20/2016.
 */
@Component
public class BankFactory {
    public Bank createBank(double cash) {
        return new Bank(cash);
    }
}
