package acedemy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double taxaSalario;
        if (salario > 0 && salario <= 34712){
            taxaSalario = salario * 9.70/100;
        } else if (salario >= 34713 && salario <= 68507){
            taxaSalario = salario * 37.35/100;
        }
        else{
            taxaSalario = salario * 49.50/100;
        }
        System.out.println("Com o salario de: " + salario + " irá pagar a taxa de: " + taxaSalario);
    }
}
