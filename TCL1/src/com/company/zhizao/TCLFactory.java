package com.company.zhizao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-17
 */

public class TCLFactory implements Factory{
    public TVProduct createTV(){
        return new TCLTVProduct();
    }

    public FrigleProduct createFrigle(){
        return new TCLFrigleProduct();
    }
}

