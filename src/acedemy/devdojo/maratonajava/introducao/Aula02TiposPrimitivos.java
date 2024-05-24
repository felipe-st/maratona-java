package acedemy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //casting é quando forçamos uma varíável a im tipo primitivo o qual o número ogonalmente não ocupa.
        //não é indicado porque a sáida pode ter resultados inesperados, o java irá cortar bytes para obter o resultado:
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFLoat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;

        //string não é tipo primitivo. É uma classe (referenced type):
        String frase = "Strings não tem limites de valores";

        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Exemplo: " + frase);
    }
}
