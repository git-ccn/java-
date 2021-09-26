package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-25
 */

public abstract class VidoappBuilder {
    vidoapp va = new vidoapp();

    public abstract void Buildtype();

    public abstract void Buildmnum();

    public abstract void Buildpalylist();

    public abstract void Buildmainmnum();

    public abstract void Buildkongzhi();

    public vidoapp creatapp() {
        return va;
    }

}

