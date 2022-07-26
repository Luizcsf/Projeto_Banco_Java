import projetobanco.Cliente;
import projetobanco.Conta;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato da projetobanco.Conta Poupança *** ");
        imprimirDadosConta();
    }


}
