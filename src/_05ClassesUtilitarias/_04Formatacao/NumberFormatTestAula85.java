package _05ClassesUtilitarias._04Formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTestAula85 {
    public static void main(String[] args) {

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(localeJP);
        nfa[2] = NumberFormat.getNumberInstance(localeBR);
        nfa[3] = NumberFormat.getNumberInstance(localeIT);

        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
