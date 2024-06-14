public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++) {
            if (numero == 3)
                continue; // Pulou a impressão do número e avançou para o próximo
            System.out.println(numero);
        }
        
        System.out.println();

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);
        }
    }
}
