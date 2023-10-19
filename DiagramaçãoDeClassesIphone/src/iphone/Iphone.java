package iphone;

import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.Ipod;

public class Iphone implements Ipod, Telefone, NavegadorInternet {

	public void tocar() {
		System.out.println("Tocando Música no Iphone");
	}
	
	public void pausar() {
		System.out.println("Pausando Música no Iphone");
	}

	public void selecionarMusica() {
		System.out.println("Selecionado Música no Iphone");
	}
	
	public void ligar() {
		System.out.println("Ligando pelo Iphone");
	}

	public void atender() {
		System.out.println("Atendo chamada pelo Iphone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz no Iphone");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página no Navegador pelo Iphone");
	}

	public void adicionarNovaAba() {
		System.out.println("Adiconado nova Aba no Navegador pelo Iphone");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Página no Navegador pelo Iphone");
	}
	
}
