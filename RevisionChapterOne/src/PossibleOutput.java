public class PossibleOutput {
    public static void main(String[] args) {
        firstPosibility();
        System.out.println("------------------End of First Possibility------------------");
        secondPossibility();
        System.out.println("------------------End of Second Possibility------------------");
    }
    public static void firstPosibility() {
    int x = 0;
    int y = 0;
     while( x < 5) {
         y = x - y;
         System.out.print(x + "" + y + " ");
         x = x + 1;
     }
        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 5");
        // x = 0   00 is x is 1 at the end y is 0
// x = 1   11 is x is 2 at the end y is 1
// x = 2   21 x is 3 at the end y is 1
// x = 3   32 x is 4 at the end y is 2
// x = 4   42 x is 5 at he end y is 2
    }

    public static void secondPossibility() {
        int x = 0;
        int y = 0;
        while( x < 5) {
            y = y + x;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 5");
        // x = 0   00 is x is 1 at the end y is 0
        // x = 1   11 x is 2 at the end y is 1
        // x = 2   23 x is 3 at the end and y is 3
        // x = 3   36 x is 4 at the end and y is 6
        // x = 4   410 x is 5 at the end and y is 10
        System.out.println("y = x + y; ---> 00 11 23 36 410 --> option 7");
    }

}

