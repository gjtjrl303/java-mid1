package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinterSelf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        String yearString = scanner.nextLine();
        System.out.print("월을 입력하세요: ");
        String monthString = scanner.nextLine();

        int year = Integer.parseInt(yearString);
        int month = Integer.parseInt(monthString);

        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

       if(date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
           System.out.print("");
       }else if(date.getDayOfWeek().equals(DayOfWeek.MONDAY)){
           System.out.print("   ");
       }else if(date.getDayOfWeek().equals(DayOfWeek.TUESDAY)){
           System.out.print("       ");
       }else if(date.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)){
           System.out.print("            ");
       }else if(date.getDayOfWeek().equals(DayOfWeek.THURSDAY)){
           System.out.print("                 ");
       }else if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
           System.out.print("                      ");
       }else if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
           System.out.print("                          ");
       }

        while (true) {
            System.out.print(date.getDayOfMonth() + "  ");
            if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                System.out.println();
            }
            LocalDate tempDate = date.plusDays(1);
            if(!tempDate.getMonth().equals(date.getMonth())){
                break;
            }
            date =tempDate;
        }
    }
}

