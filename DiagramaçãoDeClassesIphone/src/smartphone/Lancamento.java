package smartphone;


import iphone.Iphone;
import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.Ipod;



public class Lancamento {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Telefone telefone = iphone;
		Ipod ipod = iphone;
		NavegadorInternet navegadorInternet = iphone;
		
		telefone.iniciarCorreioVoz();
		telefone.atender();
		telefone.ligar();
		
		ipod.selecionarMusica();
		ipod.tocar();
		ipod.pausar();
		
		navegadorInternet.exibirPagina();
		navegadorInternet.atualizarPagina();
		navegadorInternet.adicionarNovaAba();
		
		
		
	
	}
	
}
