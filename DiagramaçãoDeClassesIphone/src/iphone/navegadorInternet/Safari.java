package iphone.navegadorInternet;

public class Safari implements NavegadorInternet {
	public void exibirPagina() {
		System.out.println("Exibindo página ");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Abrindo Nova Aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
	}
}
