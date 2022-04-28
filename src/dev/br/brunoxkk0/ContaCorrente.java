package dev.br.brunoxkk0;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void emitirExtrato() {
        System.out.println("+=== Extrato Conta Corrente ===+");
        super.imprimirInfosComuns();
    }

}
