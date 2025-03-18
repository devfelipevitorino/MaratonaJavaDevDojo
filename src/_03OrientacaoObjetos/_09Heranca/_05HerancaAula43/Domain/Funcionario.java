package _03OrientacaoObjetos._09Heranca._05HerancaAula43.Domain;

public class Funcionario extends Pessoa {
    private double salario;

    // 0 - Bloco de inicialização estatico da superclasse é executado quando a jvm carregar a super classe
    // 1 - Bloco de inicialização estatico da subclase é executado quando a jvm carregar a classe filha
    // 2 - Alocado espaço em memoria para objeto da super classe
    // 3 - Cada atributo de classe é criado e inicializado default ou oq for passado na super classe
    // 4 - Bloco de  é inicialização da super classe é exeutado
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memoria para objeto da subclasse
    // 7 - Cada atributo de classe é criado e inicializado default ou oq for passado
    // 8 - Bloco de  é inicialização da subclasse é exeutado
    // 9 - Construtor da subclasse iniciado

    static{
        System.out.println("Bloco Estatico Funcionario");
    }

    {
        System.out.println("Bloco Estatico Funcionario");
    }

    {
        System.out.println("Bloco Estatico Funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
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
