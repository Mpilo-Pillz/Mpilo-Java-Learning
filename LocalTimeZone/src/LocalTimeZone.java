import java.time.ZoneId;

public class LocalTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Local system timezone: " + zoneId);
        System.out.println("===================Zoned date time");
    }
}
