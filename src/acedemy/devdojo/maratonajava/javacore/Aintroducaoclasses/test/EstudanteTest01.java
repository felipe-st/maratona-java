package acedemy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import acedemy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 21;
        estudante.nome = "Luffy";
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
