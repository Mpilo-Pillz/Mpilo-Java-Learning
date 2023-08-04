public class PoolPuzzleOne {
    // psvm
    public static void main(String[] args) {
        int x = 0;

        while(x < 4) { //?
            // _____
            System.out.print("a"); // ?
            if (x < 1) {
                // ___________
                System.out.print(" "); //?

            }
            // ___________
            System.out.print("n"); //?
            if(x > 1) { //?
//                // ___________
//                System.out.print("an"); //?
//                // ___________
//                System.out.print(" oyster"); //?
                // ___________
                System.out.print("an"); //?
                // ___________
                System.out.print(" oyster"); //?
            }
            if( x == 1) {
                // ___________
//                System.out.print(" "); //??
//                System.out.print("noys"); //?
            }
//            if (x > 1) { //?
//                // ___________
//            }
            System.out.println();
            // ___________
            x = x + 1; // ?
        }
    }
}
