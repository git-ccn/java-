package com.company;

class Triangle implements Shape {
    public void draw(){
        System.out.println("绘制一个三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除");
    }
}
