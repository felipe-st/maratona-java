package acedemy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }
        // do - while parecido com o while, mas obrigatoriamente executa a condição ao menos uma vez
        do {
            System.out.println("dentro do do-while");
        } while (count <10);

        // for (inicialização de variável; condição; iterador)
        for (int i=0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
