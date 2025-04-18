package _05ClassesUtilitarias._05JavaTime._07ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitAula94 {
    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(2003, Month.FEBRUARY, 20, 12,0,0);

        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
    }
}
