package com.company.choux;

public class lcat implements cat {
    @Override
    public void catname() {
        System.out.println("猫");
    }

    @Override
    public void catchmouse() {
        System.out.println("抓老鼠");
    }
}
