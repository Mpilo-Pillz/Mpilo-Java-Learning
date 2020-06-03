package com.mpillz;

public class Main {

    public static void main(String[] args) {
	// make a Dog object and access it
//        Dog dog1 = new Dog();
//        dog1.bark();
//        dog1.name = "Bart";
//
//        // now make a Dog array
//        Dog[] myDogs = new Dog[3];
//        //and put some dogs in it
//        myDogs[0] = new Dog();
//        myDogs[1] = new Dog();
//        myDogs[2] = dog1;
//
//        //now access the Dogs using the array references
//        myDogs[0].name = "Fred";
//        myDogs[1].name = "Marge";
//
//        //myDogs[2] name is definitly Bart, confrim it
//        System.out.print("last dog's name is ");
//        System.out.println(myDogs[2].name);
//
//        //now loop through the array to tell the dogs to bark
//        int x = 0;
//        while(x < myDogs.length) {
//            myDogs[x].bark();
//            x = x + 1;
//        }

//        Books myBookss = new Books();
//        myBookss.ngcwadzi();
//        Books[] myBooks = new Books[3];
//        int x = 0;
//
//        myBooks[0] = new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
//
//        myBooks[0].title = "The Grapes of Java";
//        myBooks[1].title = "The Java Gatsby";
//        myBooks[2].title = "The Java Cookbook";
//
//        myBooks[0].author = "Sfiso";
//        myBooks[1].author = "Bongokuhle";
//        myBooks[2].author = "Lerato";
//
//        while (x < 3) {
//            System.out.print(myBooks[x].title);
//            System.out.print(" by ");
//            System.out.println(myBooks[x].author);
//            x = x + 1;
//        }

//        Hobbits hobbits = new Hobbits();
//        hobbits.messageToPillz();
//
//        Hobbits[] h = new Hobbits[3];
//        int z = 0;
//
//        while (z < 3 ) {
////            z = z + 1;
//            h[z] = new Hobbits();
//            h[z].name = "Bilbo";
//            if (z == 1) {
//                h[z].name = "Frodo";
//            }
//            if (z == 2) {
//                h[z].name = "Sam";
//            }
//
//            System.out.print(h[z].name + " is a ");
//            System.out.println("good Hobbit name");
//            z = z + 1;
//        }


        //Books Answer
        Hobbits hobbits = new Hobbits();
        hobbits.messageToPillz();

        Hobbits[] h = new Hobbits[3];
        int z = -1;

        while (z < 2 ) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }

            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
//            z = z + 1;
        }
    }
}
