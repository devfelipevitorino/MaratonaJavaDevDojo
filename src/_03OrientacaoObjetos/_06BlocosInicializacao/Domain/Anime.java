package _03OrientacaoObjetos._06BlocosInicializacao.Domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe é criado e inicializado por padrão default
    // 3 - Bloco de execução é exeutado
    // 4 - Construtor é executado

    {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for(int e : episodios){
            System.out.print(e + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
