package _04Exception._08ExceptionAula70.Runtime;

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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        // A ordem é da exception menos genérica para a mais genérica

        try {
            talvezLanceUmaException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void talvezLanceUmaException() throws SQLException, FileNotFoundException{

    }
}
