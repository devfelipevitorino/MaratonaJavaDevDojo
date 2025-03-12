package _03OrientacaoObjetos._02Metodos.MetodosAula17.Dominio;

public class ImprimeEstudante {

    public void imprime(Estudante estudante){
        System.out.println("--------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
