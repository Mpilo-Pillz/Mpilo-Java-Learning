import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public void arrayListStyle() {
        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("whaaaaaa");
        myList.add(a);
        String b = new String("Frog");
        myList.add(b);
        String c = new String("Mrog");
        myList.add(c);
        int theListSize = myList.size();

        Object o = myList.get(1);

        myList.remove(2);
        System.out.println("my list -->" + myList + " the size is " + theListSize + " Ow is --> " + o);

        boolean isIn = myList.contains(b);
        System.out.println("is in -> " + isIn);
    }

    public void arrayStyle() {
        String [] myArray = new String[3];
        String a = new String("wooooooooo");
        myArray[0] = a;
        String b = new String("Dog");
        myArray[1] = b;

        String c = new String("Brog");
        myArray[2] = c;
        int theSize = myArray.length;

        String o = myArray[1];
        myArray[2] = null;
        System.out.println("my array --> " + Arrays.deepToString(myArray)  + " the length is " + theSize + " Ow is --> " + o);

        boolean isIn = false;

        for (String item: myArray) {
            if(b.equals(item)) {
                isIn = true;
                break;
            }
        }
        System.out.println("is it in  " + isIn);
    }
}
