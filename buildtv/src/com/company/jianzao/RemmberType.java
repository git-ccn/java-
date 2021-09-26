package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-25
 */

public class RemmberType extends VidoappBuilder {
    @Override
    public void Buildtype() {
        va.setType("记忆模式");
    }

    @Override
    public void Buildmnum() {
        va.setMnum("没有显示菜单");
    }

    @Override
    public void Buildpalylist() {
        va.setPalylist("收藏列表");
    }

    @Override
    public void Buildmainmnum() {
        va.setMainmnum("主窗口");
    }

    @Override
    public void Buildkongzhi() {
        va.setKongzhi("控制条");
    }
}

