package com.company.zhizao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory;
        Product product;
        factory = new createBMWfactory();
        product = factory.creatfactory();
        product.display();
    }
}
