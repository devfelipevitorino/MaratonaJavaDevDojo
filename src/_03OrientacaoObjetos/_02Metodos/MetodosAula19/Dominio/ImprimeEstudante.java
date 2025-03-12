package _03OrientacaoObjetos._02Metodos.MetodosAula19.Dominio;

public class ImprimeEstudante {

    public void imprime(Estudante estudante){

        // estudante.nome = "Gohan";

        System.out.println("--------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan";
    }
}
