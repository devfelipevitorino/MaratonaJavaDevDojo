package _04Exception._11ExceptionAula73.Exception.Dominio;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
