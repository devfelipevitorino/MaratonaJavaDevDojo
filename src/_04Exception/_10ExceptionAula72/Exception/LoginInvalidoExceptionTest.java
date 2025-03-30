package _04Exception._10ExceptionAula72.Exception;

import _04Exception._10ExceptionAula72.Exception.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {

        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitada = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if(!(usernameDB.equals(usernameDigitada)) || !(senhaDB.equals(senhaDigitada))){
            throw new LoginInvalidoException("Usuario ou senha inválido!");
        }

        System.out.println("Usuário logado com sucesso!");
    }

}
