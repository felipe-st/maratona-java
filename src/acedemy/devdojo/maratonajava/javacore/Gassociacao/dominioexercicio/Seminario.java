package acedemy.devdojo.maratonajava.javacore.Gassociacao.dominioexercicio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos){
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Seminario: " + this.titulo);
        if (alunos == null) return;
        for (Aluno aluno : alunos){
            System.out.println("Alunos inscritos: " + aluno.getNome());
        }
        System.out.println("Endereço: " + local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
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

}
