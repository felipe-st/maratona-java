package acedemy.devdojo.maratonajava.javacore.Gassociacao.testeexercicio;

import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Aluno;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Local;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Professor;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Seminario;

public class ExercicioTeste02 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");

//        Aluno[] alunosParaSeminario = {aluno};
        Aluno[] alunosParaSeminario = {};
        Seminario seminario = new Seminario("Onde achar One Piece", local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
