package com.pillz;

public class Main {
    public static void main(String [] args) {
        int orig = 42;

        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);

        Clock c = new Clock();
        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }


}
