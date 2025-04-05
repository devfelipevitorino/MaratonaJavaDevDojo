package _05ClassesUtilitarias._03Date._04InternacionalizacaoDatasAula83;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InternacionalizacaoDatas {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar c = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2= DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3= DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4= DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Italia: " + df1.format(c.getTime()));
        System.out.println("Suiça: " + df2.format(c.getTime()));
        System.out.println("India: " + df3.format(c.getTime()));
        System.out.println("Japao: " + df4.format(c.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeJapao)); 

    }

}
