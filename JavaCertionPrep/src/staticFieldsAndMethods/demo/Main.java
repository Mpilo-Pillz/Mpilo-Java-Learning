package staticFieldsAndMethods.demo;
import static java.lang.System.out; // Static Import
import static staticFieldsAndMethods.demo.ConversionHelper.fromNmToMeters; // Static Import

public class Main {
    public static void main(String[] args) {
        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFl = ConversionHelper.fromFeetToFL(300);
        System.out.println(altitudeInFeet + "ft -> FL " + altitudeInFl);

        double distInMeters = fromNmToMeters(10);
        out.println(distInMeters + " Nm -> " + distInMeters + " m");

        Calculators.Distance d = new Calculators.Distance(1,1,3,3);
        out.println("Distance is " + d.calculate());
    }
}
