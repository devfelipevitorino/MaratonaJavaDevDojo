package _03OrientacaoObjetos._02Metodos.MetodosAula21.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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
        double media = 0;
        for (double s : salario) {
            media += s;
        }
        media /= salario.length;
        System.out.printf("R$ %.2f%n", media);
    }
}
