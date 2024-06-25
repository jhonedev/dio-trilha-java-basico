public class FacebookMenseger {
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo facebook Messenger");
        salvarHistoricoMensagem();
	}
    
	public void receberMensagem() {
		System.out.println("Recebendo mensagem facebook Messenger");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
