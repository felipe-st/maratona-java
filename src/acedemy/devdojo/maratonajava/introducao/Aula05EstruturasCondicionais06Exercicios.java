package acedemy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicios {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("Domingo: Fim de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia útil");
                break;
            case 3:
                System.out.println("Terça: Dia útil");
                break;
            case 4:
                System.out.println("Quarta: Dia útil");
                break;
            case 5:
                System.out.println("Quinta: Dia útil");
                break;
            case 6:
                System.out.println("Sexta: Dia útil");
                break;
            case 7:
                System.out.println("Sábado: Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
