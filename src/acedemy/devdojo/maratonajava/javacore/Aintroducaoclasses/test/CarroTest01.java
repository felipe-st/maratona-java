package acedemy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import acedemy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Honda";
        carro1.ano = 2012;
        carro1.modelo = "Fit";

        Carro carro2 = new Carro();
        carro2.nome = "Fiat";
        carro2.ano = 2005;
        carro2.modelo = "Uno";

        carro2 = carro1;

        System.out.println("Marca: " + carro1.nome + " Ano: " + carro1.ano + " Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro2.nome + " Ano: " + carro2.ano + " Modelo: " + carro2.modelo);
    }
}
