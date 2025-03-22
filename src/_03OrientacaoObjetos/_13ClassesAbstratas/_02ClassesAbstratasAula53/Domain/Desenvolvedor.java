package _03OrientacaoObjetos._13ClassesAbstratas._02ClassesAbstratasAula53.Domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus(){
        this.salario += this.salario * 0.05;
    }

}
