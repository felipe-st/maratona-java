package acedemy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //padrões de saída de arrays
        // byte, short, int, long, float, double = padrão 0
        // char = padrão '\u0000' ' '
        // boolean = padrão false
        //String = padrão null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
