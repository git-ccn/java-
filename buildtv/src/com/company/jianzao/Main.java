package com.company.jianzao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VidoappBuilder vb;
        vb = (VidoappBuilder) XMLUtil.getBean();

        Factory factory = new Factory();
        vidoapp vidoapp;
        vidoapp = factory.consturt(vb);

        String type = vidoapp.getType();
        System.out.println(type);
        System.out.println(vidoapp.getKongzhi());
        System.out.println(vidoapp.getMainmnum());
        System.out.println(vidoapp.getMnum());
        System.out.println(vidoapp.getPalylist());
    }
}
