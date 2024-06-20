import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o limite diário de saque
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicita o valor do saque
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é 0 para encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } 
            // Verifica se o saque ultrapassa o limite diário
            else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } 
            // Se o saque é permitido, atualiza o limite diário e imprime a saída
            else {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
