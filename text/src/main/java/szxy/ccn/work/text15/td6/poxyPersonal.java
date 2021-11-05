package szxy.ccn.work.text15.td6;

public class poxyPersonal implements Personal{
    private zhuPersonal zp = new zhuPersonal();
    private youPersonal yp = new youPersonal();
    Person ps;
    @Override
    public void quanxian(String name) {
      if (this.ps(name)){
          zp.quanxian(name);
      }
      else {
          yp.quanxian(name);
      }
    }

    private boolean ps(String name) {
        ps = new Person();
        return ps.panduan(name);
    }

}
