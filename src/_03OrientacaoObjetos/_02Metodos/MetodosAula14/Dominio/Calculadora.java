package _03OrientacaoObjetos._02Metodos.MetodosAula14.Dominio;

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
}
