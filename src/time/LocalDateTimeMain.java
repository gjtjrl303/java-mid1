package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime noeDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 = " + noeDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime localDateTime1 = ofDt.plusYears(1000);
        System.out.println("localDateTime1 = " + localDateTime1);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? = " + noeDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? = " + noeDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? = " + noeDt.isEqual(ofDt));

    }
}
