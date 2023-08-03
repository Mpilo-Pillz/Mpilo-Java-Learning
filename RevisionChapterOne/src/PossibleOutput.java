public class PossibleOutput {
    public static void main(String[] args) {
        firstPosibility();
        System.out.println("------------------End of First Possibility------------------");
        secondPossibility();
        System.out.println("------------------End of Second Possibility------------------");
        thirdPossibility();
        System.out.println("------------------End of Third Possibility------------------");
        fourthPossibility();
        System.out.println("------------------End of Fourth Possibility------------------");
        fifthPossibility();
        System.out.println("------------------End of Fifth Possibility------------------");
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
//        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 5");
        // x = 0   00 is x is 1 at the end y is 0
        // x = 1   11 x is 2 at the end y is 1
        // x = 2   23 x is 3 at the end and y is 3
        // x = 3   36 x is 4 at the end and y is 6
        // x = 4   410 x is 5 at the end and y is 10
        System.out.println("y = x + y; ---> 00 11 23 36 410 --> option 7");
    }

    public static void thirdPossibility() {
        int x = 0;
        int y = 0;
        while( x < 5) {
            y = y + 2;
            if( y > 4) {
                y = y - 1;
            }
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
//        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 8");
        // x = 0   02 x is 1 at the end y is 2
        // x = 1   14 x is 2 at the end y is 4
        // x = 2   25 x is 3 at the end and y is 4
        // x = 3   36 x is 4 at the end and y is 6
        // x = 4   47
        System.out.println("y = x + y; ---> 02 14 25 36 47 --> option 8");
    }

    public static void fourthPossibility() {
        int x = 0;
        int y = 0;
        while( x < 5) {
            x = x + 1;
            y = y + x;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
//        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 8");
        // x = 0   11, x2 y1 o
        // x = 2   34, x4 y4
        // x = 4   59, x6 y9
        // x = ?
        // x = ?
        System.out.println("y = x + y; ---> 11 34 59 --> option 2");
    }

    public static void fifthPossibility() {
        int x = 0;
        int y = 0;
        while( x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
//        System.out.println("y = x - y; ---> 00 11 21 32 42 --> option 8");
        // x = 0   02 x1, y2
        // x = 1   14 x2 y4
        // x = 2   36 x4, y6
        // x = 4   48 x5 y8
        // x = ?
        System.out.println("y = x + y; ---> 02 14 36 48 --> option 3");
    }
}

