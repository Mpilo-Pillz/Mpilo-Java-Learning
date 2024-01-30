import java.util.ArrayList;
import java.util.Arrays;

public class Vowels {
    public static void main(String[] args) {
Vowels vowels = new Vowels();
System.out.println(vowels.getNumOfVowels("Manzini"));
    }

    public int getNumOfVowels(String sentence) {
        int count = 0;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (char character: sentence.toCharArray()) {

            for(char vowel: vowels) {
                if (vowel == character) {
                    count++;
                }
            }
        }

        return count;
    }
}
