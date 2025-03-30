package _04Exception._11ExceptionAula73.Exception.Dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 2");
    }
}
