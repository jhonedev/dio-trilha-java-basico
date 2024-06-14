public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o índice inicia em zero
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Usando um loop for tradicional
        for (int indice=0; indice < alunos.length; indice++) {
            System.out.println("O aluno no índice " + indice + " é " + alunos [indice]);
        }

        // Usando um for-each 
        int indice = 0;
        for (String aluno : alunos) {
            System.out.println("Nome do aluno no índice " + indice++ + " é: " + aluno);
        }
    }
}
