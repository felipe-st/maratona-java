package acedemy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * / Operadores aritméticos sempre retornam um valor numérico
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == != Operadores lógicos sempre retornam um valor booleano (true or false)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVInte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVInte: " + isDezMenorQueVinte);

        // && (AND) || (or) ! negação
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoComprável: "+ isPlaystationCincoCompravel);

        // = += -= *= /= %= Operadores de atribuição
        double bonus = 1800;
        bonus += 1000;
        System.out.println("Bonus: " + bonus);

        // contador
        int contador = 0;
        contador += 1;
        contador++; //lembrando que com ++ só é possível iterar +1
        contador--;
        System.out.println(contador);
        // a ordem de incremento muda conforme a localização do ++:
        int contador2 = 0;
        System.out.println(contador2++); //primeiro executa e depois incrementa
        System.out.println(++contador2); //primeiro incrementa e depois executa
    }
}
