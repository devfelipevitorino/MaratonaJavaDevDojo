package _04Exception._10ExceptionAula72.Exception.Dominio;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
