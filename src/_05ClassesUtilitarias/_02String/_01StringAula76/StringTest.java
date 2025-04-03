package _05ClassesUtilitarias._02String._01StringAula76;

public class StringTest {
    public static void main(String[] args) {

        String nome = "Felipe"; // String constant pool
        String nome2 = "Felipe";

        nome.concat(" Ferreira");
        System.out.println(nome); // A string é imutavel
        System.out.println(nome == nome2); // As duas variaveis apontam para o mesmo objeto em memoria.
        System.out.println("===================");

        nome = nome.concat(" Ferreira");
        System.out.println(nome); // Alterou a referencia da variavel para a string concatenada
        System.out.println(nome == nome2);
        System.out.println("===================");

        String nome3 = new String("Felipe"); //Cria uma nova variavel de referencia, um objeto e uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        System.out.println("===================");
    }
}
