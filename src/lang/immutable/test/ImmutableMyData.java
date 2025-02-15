package lang.immutable.test;

public class ImmutableMyData {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public ImmutableMyData withYear(int year){
        return new ImmutableMyData(year, month, day);
    }

    @Override
    public String toString() {
        return "ImmutableMyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
