package _05ClassesUtilitarias._05JavaTime._08Temporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
       DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
       int addDays;
       switch (dayOfWeek){
           case FRIDAY: addDays = 3; break;
           case SATURDAY: addDays = 2; break;
           default: addDays = 1;
       }
       return temporal.plus(addDays, ChronoUnit.DAYS);
    }

}

public class TemporalAdjustersAula96 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(18).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
