import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmentro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        // validar se parâmetroUm é MAIOR que parâmetroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Realizar o for para imprimir  os numeros com base na variável contagem
        for (int numero = 1; numero <= contagem; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }
    }   
}
