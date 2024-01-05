public class BeTheJVM {
    public static void main(String[] args) {
        BeTheJVM output = new BeTheJVM();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}

// 0 7 -> 8
// 1 8 -> 9
// 2 9 -> 10
// 3 10 -> 11
// 4 11 -> 12
// 5 12 -> 13 14

// i            is i > 4    is val > 14         if i is great 4           if vale is > 14
// 0 7 -> 8     n           n
// 1 8 -> 9      n           n
// 2 9 -> 10    n              n
// 3 10 -> 11   n               n
// 4 11 -> 12   n               n
// 5 12 -> 13   y               n                   14  i = 5 x 13
// 6 14 -> 15   y               y                  14 15 i = 6 x 13 15 i = 6