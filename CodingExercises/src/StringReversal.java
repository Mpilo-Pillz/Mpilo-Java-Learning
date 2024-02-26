import java.util.ArrayList;
import java.util.Arrays;

public class StringReversal {
    public static void main(String[] args) {
        StringReversal stringReversal = new StringReversal();
        stringReversal.reverse("MbuzuMbuzu");
    }

    void reverse(String word) {
        ArrayList<String> reversedStringArray = new ArrayList<>();
        String wordArrayList[] = word.split("");
        String reveredWord = "";

        System.out.println(Arrays.toString(wordArrayList));

        for (int i = wordArrayList.length - 1; i >= 0; i--) {
            reveredWord += wordArrayList[i];
        }

        System.out.println("the revered word is " + reveredWord);


    }
}
