package _05ClassesUtilitarias._02String._04StringAula79;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Felipe Ferreira";
        nome.concat(" Dev");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Felipe Ferreira");
        sb.append(" Dev").append(" Java");
        sb.substring(0,3); //substring retorna uma string, por isso não altera o string builder
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
