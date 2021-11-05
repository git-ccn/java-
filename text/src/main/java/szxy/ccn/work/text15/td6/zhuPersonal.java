package szxy.ccn.work.text15.td6;

public class zhuPersonal implements Personal{
    zhuce zhu = new zhuce();
    Tiezi tz = new Tiezi();
    tiezhi tzi = new tiezhi();
    @Override
    public void quanxian(String name) {
        System.out.println(name);
        zhu.xiugai();
        tz.fatei();
        tzi.xiugaiT();
    }
}
