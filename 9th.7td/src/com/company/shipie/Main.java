package com.company.shipie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        API ap;
        ap = (API) XMLUtil.getBean();
        ap.WindowsMediaPlayer();
        ap.RealPlayer();
    }
}
