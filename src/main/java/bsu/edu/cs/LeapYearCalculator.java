package bsu.edu.cs;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        return ((year%4 == 0 && year%100 != 0)  || (year%400 == 0 && year%100 == 0 ));

    }
}
