package _03OrientacaoObjetos._09Heranca._04HerancaAula42.Domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: R$"+this.salario);
    }

    public void comprovanteRecebimento(){
        System.out.println("Eu "+this.nome+" recebi o salário de R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
