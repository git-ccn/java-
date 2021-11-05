package szxy.ccn.work.text15.td6;

public class youPersonal implements Personal {
    Tie t = new Tie();
    @Override
    public void quanxian(String name) {
        System.out.println(name);
        t.look();
    }
}
