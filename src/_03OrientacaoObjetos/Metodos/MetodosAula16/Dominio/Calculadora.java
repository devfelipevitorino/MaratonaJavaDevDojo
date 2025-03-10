package _03OrientacaoObjetos.Metodos.MetodosAula16.Dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(30-10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumero(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumero02 (double num1, double num2){
        if(num2 == 0) {
            return 0;
        }else {
            return num1 / num2;
        }
    }

    public double divideDoisNumero03 (double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        }else {
            return 0;
        }
    }

    public void imprimiDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera dos numeros ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
