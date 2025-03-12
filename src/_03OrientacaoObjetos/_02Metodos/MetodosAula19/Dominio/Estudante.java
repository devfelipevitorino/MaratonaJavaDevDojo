package _03OrientacaoObjetos._02Metodos.MetodosAula19.Dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){

        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}
