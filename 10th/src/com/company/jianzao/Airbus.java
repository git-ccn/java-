package com.company.jianzao;

public class Airbus extends Buildman {
    @Override
    public void flyman() {
        pl.buildfly();
        System.out.println("空客");
    }
}
