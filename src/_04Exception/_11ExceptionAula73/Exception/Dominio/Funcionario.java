package _04Exception._11ExceptionAula73.Exception.Dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException, ArithmeticException { //Não pode declarar uma exception mais generica que a da classe Pessoa, apenas mais especifico.
        System.out.println("Salvando funcionario");
    }
}
