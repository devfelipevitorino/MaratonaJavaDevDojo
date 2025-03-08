package _03OrientacaoObjetos.Classes.ClassesAula11;

import _03OrientacaoObjetos.Classes.ClassesAula11.Dominio.Carro;

public class ClassesAula11 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Mustang";
        carro1.modelo = "Fastback";
        carro1.ano = 1967;

        carro2.nome = "Nissan Skyline";
        carro2.modelo = "R34 GT-R";
        carro2.ano = 2000;

        System.out.println("Nome: " + carro1.nome + " " +
                           "Modelo: " + carro1.modelo + " " +
                           "Ano: " + carro1.ano);

        System.out.println("Nome: " + carro2.nome + " " +
                           "Modelo: " + carro2.modelo + " " +
                           "Ano: " + carro2.ano);

    }
}
