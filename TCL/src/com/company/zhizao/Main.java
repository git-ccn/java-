package com.company.zhizao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory;
        TVProduct tv;
        FrigleProduct frigle;
        factory = (Factory) XMLUtil.getBean();
        tv = factory.createTV();
        frigle = factory.createFrigle();
        tv.display();
        frigle.display();
    }
}
