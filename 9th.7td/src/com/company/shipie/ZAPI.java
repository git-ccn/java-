package com.company.shipie;

public class ZAPI extends API {
    private API1 api1;
    private diaoy dy;

    public ZAPI() {
        api1 = new API1();
        dy = new diaoy();
    }

    @Override
    public void WindowsMediaPlayer() {
        api1.WindowsAPI();
        dy.windowsdiaoy();
    }

    @Override
    public void RealPlayer() {
        api1.RealAPI();
        dy.Realdiaoy();
    }
}
