package _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain;

public class Local {

    private String endereco;

    public void imprime(){
        System.out.println("---Informações do local---");
        System.out.println("ENDEREÇO: " +endereco);
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
