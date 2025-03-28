package _04Exception._06ExceptionAula68.Runtime;

public class RuntinemExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked => Herdam diretamente Exception, lança erro em tempo de compilação (IOExeception, SQLException...).
        // Unchecked => Herdam de RuntimeException (IndexOfBoundException, NullPointerException...).


        extracted();
        extracted2();

    }

    private static String extracted() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

    private static void extracted2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

}
