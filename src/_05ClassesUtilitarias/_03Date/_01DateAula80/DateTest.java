package _05ClassesUtilitarias._03Date._01DateAula80;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1743811469181L); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
