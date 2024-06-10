public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        // estudar a classe String que presenta texto
        String meuNome = "Jonathan Borges";
        
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Chamamos essa conversão de casting

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Para variáveis que não seja permitida alterações é necessário colocar "final"
        // no início da variável seguido do tipo, alem do nome da variável está em CAIXA ALTA.
        final double VALOR_DE_PI = 3.14;
    }
}
