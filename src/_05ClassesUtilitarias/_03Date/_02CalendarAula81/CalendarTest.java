package _05ClassesUtilitarias._03Date._02CalendarAula81;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 2); // Vira o dia, mes ou ano
        c.roll(Calendar.HOUR, 2); // Não vira o dia, mes ou ano

        Date date = c.getTime();
        System.out.println(date);

    }
}
