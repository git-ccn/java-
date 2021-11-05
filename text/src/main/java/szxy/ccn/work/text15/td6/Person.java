package szxy.ccn.work.text15.td6;

public class Person {
    public boolean panduan(String name){
        if (name.equalsIgnoreCase("注册用户")){
             System.out.println(name+"拥有高级权限");
             return true;
        }
        else {
            System.out.println(name + "拥有低级权限");
            return false;
        }
    }
}
