package _04Exception._07ExceptionAula69.Error;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade (){
        recursividade();
    }
}
