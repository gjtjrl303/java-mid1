package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_DAY);
        System.out.println("supported = " + supported);
        if (supported) {
            int second = now.get(ChronoField.SECOND_OF_DAY);
            System.out.println("second = " + second);
        }

    }
}
