package acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import acedemy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 10));
        calculadora.imprimeDivisaoDeDoisNumeros(15,3);
    }
}
