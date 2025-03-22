package _03OrientacaoObjetos._13ClassesAbstratas._02ClassesAbstratasAula53.Domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario += this.salario * 0.2;
    }

}
