package com.company;
public class Main {
    public static void main(String[] args){
	// write your code here
        try {
            Shape shape;
            shape = Factory.getshape("T");
            shape.draw();
            shape.erase();
        }
catch (UnsupportedShapeException e){
            System.out.println(e.getMessage());
}
    }
}
