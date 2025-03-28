package _04Exception._05ExceptionAula67.Error;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade (){
        recursividade();
    }
}
