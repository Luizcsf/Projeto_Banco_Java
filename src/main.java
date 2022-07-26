import projetobanco.Cliente;
import projetobanco.Conta;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Cliente luigi = new Cliente();
        luigi.setNome("Luigi Bellanova");
        Conta contaCorrente = new ContaCorrente(luigi);
        Conta contaPoupanca = new ContaPoupanca(luigi);
        contaCorrente.depositar(300);
        contaPoupanca.depositar(300);

        contaCorrente.transferir(300, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        System.out.println("-----------------");
        Banco banco = new Banco("Santander", List.of(contaCorrente, contaPoupanca));
        banco.listarClientes();
    }
}
