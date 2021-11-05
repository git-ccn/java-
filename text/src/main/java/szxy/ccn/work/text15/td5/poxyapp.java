package szxy.ccn.work.text15.td5;

public class poxyapp implements app{
    private realapp ra = new realapp();
    private logger lo;

    private void log() {
        lo = new logger();
        lo.log();
    }
    @Override
    public void method() {
        try {
            this.log();
            ra.method();

        }catch (Exception e) {
            System.out.println("方法method调用失败");
        }

    }


}

