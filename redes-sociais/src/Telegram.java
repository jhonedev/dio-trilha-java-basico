public class Telegram {
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem Telegram Messenger");
        salvarHistoricoMensagem();
	}
    
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Telegram");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
