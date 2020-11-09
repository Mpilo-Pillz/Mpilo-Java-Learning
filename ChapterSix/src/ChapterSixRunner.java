import java.util.ArrayList;

public class ChapterSixRunner {
    public static void main(String [] args) {
        ArrayVsArrayList arrayVsArrayList = new ArrayVsArrayList();
        arrayVsArrayList.arrayListStyle();
        arrayVsArrayList.arrayStyle();

        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("4");
        String b = new String("5");
        myList.add(a);
        myList.add(b);
        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(myList);
        dotCom.checkYourSelf("4");
        dotCom.checkYourSelf("5");
        dotCom.checkYourSelf("6");
    }
}
