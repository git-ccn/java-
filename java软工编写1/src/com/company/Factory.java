package com.company;

public class Factory {
    public static Shape getshape(String type) throws UnsupportedShapeException{
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
        }else if (type!="circle"&&type!="rectangle"&&type!="triangle"){
            throw new UnsupportedShapeException("输入错误");
        }

        return shape;
    }
}





