package com.company.choux;

public class Main {

    public static void main(String[] args) {
	// write your code here
        cat ct = new Adapter(new ldog());
        ct.catname();
        ct.catchmouse();

        dog dg = new Adapter(new lcat());
        dg.dogname();
        dg.cry();
    }
}
