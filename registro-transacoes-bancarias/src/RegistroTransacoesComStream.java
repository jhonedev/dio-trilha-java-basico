import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada que informa o saldo inicial da conta
        double saldo = scanner.nextDouble();
        // Lê a entrada com a quantidade total de transações
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a entrada com o tipo de transação (D para depósito ou S para saque)
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a entrada com o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final da conta
        System.out.println("Saldo : " + saldo);

        // Exibe a lista de transações usando a Stream API
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo().toString().toLowerCase() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Character getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
