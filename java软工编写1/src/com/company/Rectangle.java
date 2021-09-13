package com.company;

class Rectangle implements Shape {
    public void draw(){
        System.out.println("绘制一个矩形");
    }

    @Override
    public void erase() {
        System.out.println("擦除");
    }
}
