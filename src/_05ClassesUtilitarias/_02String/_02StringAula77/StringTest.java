package _05ClassesUtilitarias._02String._02StringAula77;

public class StringTest {
    public static void main(String[] args) {

        String nome = "Luffy";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println("============");

        String numero = "012345";
        System.out.println(numero.substring(3, numero.length())); // O indice final não é exibido

        System.out.println("==============");

        String nome2 = "     Luffy     ";
        System.out.println(nome.trim()); // remove os espaços no começo e no fim

    }
}
