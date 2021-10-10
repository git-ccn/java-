package com.company.jianzao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Buildman bm;
        plane p;
        p = (plane) XMLUtil.getBean("os");
        bm = (Buildman) XMLUtil.getBean("image");
        bm.setplane(p);
        bm.flyman();
    }
}
