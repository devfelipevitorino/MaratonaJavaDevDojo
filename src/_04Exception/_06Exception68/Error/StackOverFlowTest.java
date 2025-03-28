package _04Exception._06Exception68.Error;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade (){
        recursividade();
    }
}
