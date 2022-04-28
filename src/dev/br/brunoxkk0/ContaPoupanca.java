package dev.br.brunoxkk0;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void emitirExtrato() {
        System.out.println("+=== Extrato Conta Poupança ===+");
        super.imprimirInfosComuns();
    }

}
