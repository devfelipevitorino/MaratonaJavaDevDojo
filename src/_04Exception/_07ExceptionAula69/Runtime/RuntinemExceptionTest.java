package _04Exception._07ExceptionAula69.Runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntinemExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked => Herdam diretamente Exception, lança erro em tempo de compilação (IOExeception, SQLException...).
        // Unchecked => Herdam de RuntimeException (IndexOfBoundException, NullPointerException...).

        try {
//          throw new IndexOutOfBoundsException();
//          throw new ArithmeticException();
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro doArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        // A ordem é da exception menos genérica para a mais genérica

        try {
            talvezLanceUmaException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceUmaException() throws SQLException, FileNotFoundException{

    }
}
