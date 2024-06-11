import javax.print.DocFlavor.STRING;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // OPERADORES UNÁRIOS
        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        // Para tornar esse valor de negativo para positivo deve multiplicar
        numero = numero * -1;
        System.out.println(numero);

        // INCREMENTO E DECREMENTO DE VALORES
        System.out.println(numero ++);  // numero = numero +1;
        System.out.println(numero);

        // INVERTENDO VALORES BOOLEANOS
        boolean variavel = true;
        variavel = !variavel; // Para negar a variavel usa-se "!"
        System.out.println(variavel);

        //Operador ternário
        int a, b;

        a = 4;
        b = 3;

        // String resultado = "";
        // //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if (a == b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        //MESMA CPNDICIONAL UTILIZANDO O OPERADOR TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //OPERADORES RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");

        // Quando estiver falando sobre string e/ou objetos, utiliza-se o método equals
        String nomeUm = "JONATHAN";
        String nomeDois = new String("JONATHAN");
        System.out.println("nomeUm é igual a nomeDois? " + (nomeUm.equals(nomeDois)));
        }

        //OPERADORES LÓGICOS (&& E) e (|| OU)
        boolean condição1 = true;
        boolean condição2 = true;

        if (condição1 || condição2){
            System.out.println("uma das condições são verdadeiras");
        }

        if (condição1 && condição2){
            System.out.println("as duas condições são verdadeiras");
        }

        if (condição1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("fim");

    }
}
