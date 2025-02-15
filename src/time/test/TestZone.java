package time.test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        Instant instantTime = Instant.from(seoulTime);
        ZonedDateTime londonTime = ZonedDateTime.ofInstant(instantTime, ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = ZonedDateTime.ofInstant(instantTime, ZoneId.of("America/New_York"));
        System.out.println("newYorkTime = " + newYorkTime);
        System.out.println("londonTime = " + londonTime);
    }
}
