public class BootleSongThirdEdition {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "Bottles";

        while(bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, haning on the wall");
            }
        }
     }
}
