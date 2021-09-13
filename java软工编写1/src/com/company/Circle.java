package com.company;

class Circle implements Shape {
    public void draw(){
        System.out.println("绘制一个圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除");
    }
}
