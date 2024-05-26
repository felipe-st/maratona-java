package acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Artemis");
        funcionario01.setIdade(18);
        funcionario01.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario01.imprime();
    }
}
