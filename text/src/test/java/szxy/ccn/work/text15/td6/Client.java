package szxy.ccn.work.text15.td6;

public class Client {
    public static void main(String[] args) {
        Personal psa;
        psa = (Personal) XMLUtil.getBean();
        psa.quanxian("注册用户");

    }
}
