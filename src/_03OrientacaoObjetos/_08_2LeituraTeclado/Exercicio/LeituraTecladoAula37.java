package _03OrientacaoObjetos._08_2LeituraTeclado.Exercicio;

import java.util.Scanner;

public class LeituraTecladoAula37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SOFTWARE DE PREVISÃO DO FUTURO");
        System.out.println("Digite sua pergunta que responderei sim ou não!");

        String pergunta = scanner.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }

    }
}
