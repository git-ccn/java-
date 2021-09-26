package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-26
 */

public class Customer implements Cloneable {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public Customer clone() {
      Object obj = null;
      try{
          obj = super.clone();
          return (Customer) obj;
      }catch (CloneNotSupportedException e) {
          System.out.println("不能复制");
          return null;
      }
    }
}

