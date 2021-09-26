package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-25
 */

public class Factory {
    public vidoapp consturt(VidoappBuilder vb) {
        vidoapp vd;
        vb.Buildtype();
        vb.Buildmnum();
        vb.Buildpalylist();
        vb.Buildmainmnum();
        vb.Buildkongzhi();

        vd = vb.creatapp();
        return vd;
    }
}

