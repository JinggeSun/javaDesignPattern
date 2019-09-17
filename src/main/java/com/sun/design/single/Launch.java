package com.sun.design.single;

public class Launch {

    public static void main(String[] args) {
        HungrySingle hungrySingle = HungrySingle.getInstance();

        hungrySingle.say();
    }
}
