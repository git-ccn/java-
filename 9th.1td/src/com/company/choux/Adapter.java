package com.company.choux;

public class Adapter implements cat, dog {
    private dog d;
    private cat c;

    public Adapter(cat c) {
        this.c = c;
    }

    public Adapter(dog d) {
        this.d = d;
    }

    @Override
    public void catname() {
        System.out.println("猫");
    }

    @Override
    public void catchmouse() {
        d.cry();
    }

    @Override
    public void dogname() {
        System.out.println("狗");
    }

    @Override
    public void cry() {
        c.catchmouse();
    }
}
