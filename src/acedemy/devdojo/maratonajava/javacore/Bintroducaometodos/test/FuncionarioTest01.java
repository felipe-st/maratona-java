package acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Artemis";
        funcionario01.idade = 18;
        funcionario01.salarios = new double[]{1200, 987.32, 2000};

        funcionario01.imprime();

        funcionario01.mediaSalarios();
    }
}
