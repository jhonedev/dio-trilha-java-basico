public class Main {
    public static void main(String[] args) {
        Cliente clienteJonathan = new Cliente();
        clienteJonathan.setNome("Jonathan");

        Conta ContaCorrente = new ContaCorrente(clienteJonathan);
        ContaCorrente.depositar(100);

        Conta ContaPoupanca = new ContaPoupanca(clienteJonathan);
        ContaCorrente.transferir(75, ContaPoupanca);

        ContaCorrente.imprimirExtrato();
        ContaPoupanca.imprimirExtrato();
    }
}
