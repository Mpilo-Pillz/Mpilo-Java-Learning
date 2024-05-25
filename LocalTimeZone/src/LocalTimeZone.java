import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Local system timezone: " + zoneId);
        System.out.println("===================Zoned date time");
        ZonedDateTime zonedDateTime =  ZonedDateTime.now();
        System.out.println("ZONEDT: " + zonedDateTime
        );
    }
}
