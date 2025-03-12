package _03OrientacaoObjetos._03ModificadorDeAcesso.ModificadorDeAcessoAula24.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprimeDadosFuncionario(){
        System.out.println("<-----------Dados--do--Funcionário------------->");
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        if(salario == null){
            return;
        }
        System.out.println("<-----------Salários------------->");
        for (double s : salario){
            System.out.println("R$" + s);
        }
    }

    public void MediaSalario(){
        if (salario == null) {
            return;
        }
        System.out.println("<-----------Média--Salarial----------->");
        for (double s : salario) {
            media += s;
        }
        media /= salario.length;
        System.out.printf("R$ %.2f%n", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
