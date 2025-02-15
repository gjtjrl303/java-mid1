package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now.get(ChronoField.SECOND_OF_DAY) = " + now.get(ChronoField.SECOND_OF_DAY));
    }
}
