import projetobanco.Cliente;
import projetobanco.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato da projetobanco.Conta Corrente ***");
        imprimirDadosConta();
    }
}
