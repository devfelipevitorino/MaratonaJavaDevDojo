package _03OrientacaoObjetos._08Associacao._8_1LeituraTeclado;

import java.util.Scanner;

public class LeituraTeclado36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade abaixo: ");
        int idade = scanner.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = scanner.next().charAt(0);
        System.out.println("--------------------------------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);


    }
}
