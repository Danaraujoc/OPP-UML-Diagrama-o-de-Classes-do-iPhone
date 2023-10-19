package iphone.aparelhoTelefonico;

public class CorreioVoz implements Telefone {
	
	public void ligar() {
		System.out.println("Ligando para contato");
	}
	
	public void atender() {
		System.out.println("Atendendo Chamada");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Abrindo Correio de Voz");
	}
}
