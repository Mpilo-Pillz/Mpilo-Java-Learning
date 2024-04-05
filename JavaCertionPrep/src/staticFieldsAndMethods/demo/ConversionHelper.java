package staticFieldsAndMethods.demo;

public class ConversionHelper {
    private static final int METERS_IN_ONE_NM = 1852;

    private static Double milesInOneKm;

    static {
        milesInOneKm = 0.621371;
    }

    public static int fromFeetToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * METERS_IN_ONE_NM;
    }
}
