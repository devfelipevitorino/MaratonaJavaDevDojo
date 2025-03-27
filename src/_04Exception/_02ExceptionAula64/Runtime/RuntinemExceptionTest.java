package _04Exception._02ExceptionAula64.Runtime;

public class RuntinemExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked => Herdam diretamente Exception, lança erro em tempo de compilação (IOExeception, SQLException...).
        // Unchecked => Herdam de RuntimeException (IndexOfBoundException, NullPointerException...).

        Object object = null;
        System.out.println(object.toString()); // => NullPointerException

        int[] num = {1,2};
        System.out.println(num[2]); // => ArrayIndexOfBoundException
    }
}
