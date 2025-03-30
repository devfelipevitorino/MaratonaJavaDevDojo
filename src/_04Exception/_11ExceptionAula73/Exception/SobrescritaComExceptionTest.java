package _04Exception._11ExceptionAula73.Exception;

import _04Exception._11ExceptionAula73.Exception.Dominio.Funcionario;
import _04Exception._11ExceptionAula73.Exception.Dominio.LoginInvalidoException;
import _04Exception._11ExceptionAula73.Exception.Dominio.Pessoa;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
