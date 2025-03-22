package _03OrientacaoObjetos._13ClassesAbstratas._03ClassesAbstratasAula54.Domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario += this.salario * 0.2;
    }

//    @Override
//    public void imprime() {
//
//    }
}
