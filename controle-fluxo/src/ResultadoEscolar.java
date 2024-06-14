public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota  = 4;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; // Equivale ao if, else if e else.

        System.out.println(resultado);
    }
}
