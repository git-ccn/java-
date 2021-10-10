package com.company.choux;

public class ldog implements dog {
    @Override
    public void dogname() {
        System.out.println("狗");
    }

    @Override
    public void cry() {
        System.out.println("狗叫");
    }
}
