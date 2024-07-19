public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //atributos
    protected int agencia;
    protected int numero;
    protected double saldo;

    //construtor
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        
    }

    @Override
    public void sacar(double valor) {
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
