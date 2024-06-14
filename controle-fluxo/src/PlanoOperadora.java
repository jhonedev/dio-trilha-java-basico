public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        // Uso o switch case quando quero ou não que imprima mais alguma coisa que estiver abaixo da minha opcao.
        // Caso nçao queira usar as mensagem abaixo da opção selecionada basta usar o break
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
