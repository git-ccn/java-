package com.company.jianzao;

public class Boeing extends Buildman {
    @Override
    public void flyman() {
        pl.buildfly();
        System.out.println("波音");
    }
}
