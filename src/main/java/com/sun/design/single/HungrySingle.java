package com.sun.design.single;

/**
 * 饿汉
 */
public class HungrySingle {

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){};

    public static HungrySingle getInstance(){
        return hungrySingle;
    }

    public void say (){
        System.out.printf("hello");
    }

}
