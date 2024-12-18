package poo.desafio.iphone;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet, CameraFotografica{

	// CHAMDNO MÉTODOS DA INTERFACE DA CAMERA FOTOGRAFICA:
	public void tirarFoto() {
		System.out.println("Diga XXXXX para tirar foto!");

	}
	public void gravarVideo() {
		System.out.println("3, 2, 1 gravando!");
		
	}
	public void exibirFoto() {
		System.out.println("Exibindo a galeria de fotos!");
		
	}
	public void exibirVideo() {
		System.out.println("Exibindo os vídeos salvos na galeria.");
		
	}

	// CHAMANDO MÉTODOS DA INTERFACE DO NAVEGADOR DE INTERNET:
	public void exibirPagina(String url) {
		System.out.println("Exibindo google.com!");
		
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba.");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página!");
		
	}

	// CHAMANDO MÉTODOS DO APARELHO TELEFONICO:
	public void ligar(String numero) {
		System.out.println("Ligando para cliente!");
		
	}
	public void atender() {
		System.out.println("Atendendo ligação!");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("Recuperando mensagem de voz!");
		
	}

	// CHAMANDO MÉTODOS QUE REPRODUZ MÚSICAS NO ITUNES:
	public void tocar() {
		System.out.println("Reproduzindo modão no iTunes!");
		
	}
	public void pausar() {
		System.out.println("Pausando música!");
		
	}
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música!");
		
	}
	

	
}
