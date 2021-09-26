package com.company.jianzao;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Customer cus,cut;
      cus = new Customer();
      cut = cus.clone();
      System.out.println("是否相同"+(cus == cut));
    }
}
