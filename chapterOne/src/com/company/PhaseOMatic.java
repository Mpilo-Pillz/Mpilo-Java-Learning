package com.company;

public class PhaseOMatic {
    String nicName = "Pillz";

    public void generateBullSlug() {
        System.out.printf("Mpilo %s \n", nicName);

        String[] wordListOne = { "Big Digits", "O G shit", "Hard"};
        String[] wordListTwo = {"blining", "gang ganging", "ballin"};
        String[] wordListTrhee = {"thang on my hip", "incase a g wanna trip", "out ma pocket stop it"};

        int rand1 = (int) (Math.random() * wordListOne.length);
        int rand2 = (int) (Math.random() * wordListTwo.length);
        int rand3 = (int) (Math.random() * wordListTrhee.length);

        String bar = String.format("Yaw Caah is %s %s %s", wordListOne[rand1], wordListTwo[rand2], wordListTrhee[rand3]);

        System.out.println(bar);
    }
}
