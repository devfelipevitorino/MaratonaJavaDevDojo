package _04Exception._04ExceptionAula66.Error;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade (){
        recursividade();
    }
}
