package _05ClassesUtilitarias._04Formatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _04SimpleDateFormatTestAula87 {
    public static void main(String[] args) {

        String mascara = "'Amsterdam' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 07 de abril de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
