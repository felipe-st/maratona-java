package acedemy.devdojo.maratonajava.javacore.Kenum.teste;

import acedemy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import acedemy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

import static acedemy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
