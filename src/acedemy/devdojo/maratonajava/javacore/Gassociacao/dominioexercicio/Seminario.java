package acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Professor professor){
        this.titulo = titulo;
        this.alunos = alunos;
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("Seminario: " + this.titulo);
        if (alunos == null) return;
        for (Aluno aluno : alunos){
            System.out.println("Alunos inscritos: " + aluno.getNome());
        }
        if (professor == null) return;
        System.out.println("Ministrante: " + professor.getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
