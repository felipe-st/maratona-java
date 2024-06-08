package acedemy.devdojo.maratonajava.javacore.Gassociacao.testeexercicio;

import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Aluno;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Local;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Professor;
import acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio.Seminario;

public class ExercicioTeste01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pandora", 19);
        Aluno aluno2 = new Aluno("Artemis", 21);
        Aluno aluno3 = new Aluno("Pallas", 18);
        Local local1 = new Local("UFC");
        Local local2 = new Local("UECE");

        Seminario seminario1 = new Seminario("Gatos e a dominação mundial", local1);
        Seminario seminario2 = new Seminario("Tecnologias para fabricação de ração de qualidade", local2);
        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor1 = new Professor("Pitty", "Política", seminarios);

        Aluno[] alunos1 = {aluno1, aluno2};
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);

        Aluno[] alunos2 = {aluno3};

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);

        seminario1.imprime();
        seminario2.imprime();
        professor1.imprime();
    }
}
