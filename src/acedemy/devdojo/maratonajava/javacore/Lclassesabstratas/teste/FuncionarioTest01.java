package acedemy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import acedemy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import acedemy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import acedemy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 2000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
