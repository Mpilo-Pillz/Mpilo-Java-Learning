public class MixFour {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        MixFour[] mixes = new MixFour[20];
        int i = 0;

        while() {
            mixes[i] = new MixFour();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);
    }

    public  int maybeNew(int index) {
        if () {
            MixFour mix = new MixFour();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }

}
