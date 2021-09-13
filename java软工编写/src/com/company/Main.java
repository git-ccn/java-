package com.company;
abstract class Person{
     abstract void person();
}

class man extends Person{
    void person(){
        System.out.println("man");
    }
}

class women extends Person{
    void person(){
        System.out.println("women");
    }
}

class robot extends Person{
    void person(){
        System.out.println("robot");
    }
}

class nvwa{
    public static Person getperson(String arg){
        Person per=null;
        if (arg.equalsIgnoreCase("A")){
            per = new man();
            per.person();
                }
        if (arg.equalsIgnoreCase("B")){
            per = new women();
            per.person();
        }
        if (arg.equalsIgnoreCase("R")){
            per = new robot();
            per.person();
        }
        return per;
            }

        }


public class Main {

    public static void main(String[] args) {
	// write your code here
        Person pe;
        pe =nvwa.getperson("A");
    }
}
