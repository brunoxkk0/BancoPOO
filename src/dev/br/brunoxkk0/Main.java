package dev.br.brunoxkk0;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("TestBank");

        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");

        ContaPoupanca cp = new ContaPoupanca(cliente);
        cp.depositar(1000);

        ContaCorrente cc = new ContaCorrente(cliente);
        cp.transferir(500, cc);

        cp.emitirExtrato();
        cc.emitirExtrato();

    }

}
