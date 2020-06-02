package com.company;

public class BigX {
    public void big() {
        int x = 1;

        while ( x < 10 ) {
            if (x > 3) {
                System.out.println("big x");
            }
            x++;
        }
    }

    public void small() {
        int x = 5;

        while ( x > 1) {
            x = x--;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }

    public void ayt() {
        int x = 5;
        while ( x > 1) {
            x = x - 1;
            if(x > 3 && x < 6) {
                System.out.println("ayt x");
            }
        }
    }
}
