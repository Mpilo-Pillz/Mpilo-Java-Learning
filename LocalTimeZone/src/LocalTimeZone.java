import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Local system timezone: " + zoneId);
        System.out.println("===================Zoned date time");
        ZonedDateTime zonedDateTime =  ZonedDateTime.now();
        System.out.println("ZONEDT: " + zonedDateTime);

        LocalTimeZone localTimeZone = new LocalTimeZone();
        localTimeZone.convertTimezone("2024-05-25T10:15:30");
    }

    void convertTimezone(String utcTime) {
        String utcDateString = utcTime;

        // Define the formatter for parsing the date string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        // Parse the date string to a LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(utcDateString, formatter);

        // Define the UTC time zone
        ZoneId utcZoneId = ZoneId.of("UTC");

        // Convert LocalDateTime to ZonedDateTime in UTC
        ZonedDateTime utcZonedDateTime = localDateTime.atZone(utcZoneId);

        // Define the local time zone (system's default time zone)
        ZoneId localZoneId = ZoneId.systemDefault();

        // Convert the ZonedDateTime from UTC to the local time zone
        ZonedDateTime localZonedDateTime = utcZonedDateTime.withZoneSameInstant(localZoneId);

        // Print the original and converted date and time
        System.out.println("Original Date and Time (UTC): " + utcZonedDateTime);
        System.out.println("Converted Date and Time (" + localZoneId + "): " + localZonedDateTime);
    }
}


