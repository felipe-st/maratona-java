package acedemy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições de doar";
        // operador ternario:
        // condicao ? verdadeiro : falso
        String resultado = salario > 3000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
