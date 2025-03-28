package _04Exception._05ExceptionAula67.Runtime;

public class RuntinemExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked => Herdam diretamente Exception, lança erro em tempo de compilação (IOExeception, SQLException...).
        // Unchecked => Herdam de RuntimeException (IndexOfBoundException, NullPointerException...).

        try {
            divisao(1,0); // => ArithmeticException
        }catch (RuntimeException e){
            e.printStackTrace();
        }

//        divisao(1,0); // => ArithmeticException

        System.out.println("Código finalizado");


    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Valor inválido, divisor não pode ser 0");
        }
        return a / b;
    }
}
