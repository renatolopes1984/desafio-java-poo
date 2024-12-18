package lojinha.apple;

import poo.desafio.iphone.Iphone;
import poo.desafio.iphone.AparelhoTelefonico;
import poo.desafio.iphone.CameraFotografica;
import poo.desafio.iphone.NavegadorInternet;
import poo.desafio.iphone.ReprodutorMusical;

public class LojaApple {
	public static void main(String[] args) {
		
		//CRIANDO UM NOVO IPHONE
		Iphone iphone = new Iphone();
		
		//INVOCANDO OS MÉTODOS DA CAMERA FOTOGRAFICA
		iphone.tirarFoto();
		iphone.gravarVideo();
		iphone.exibirFoto();
		iphone.exibirVideo();
		
		//INVOCANDO OS MÉTODOS DO NAVEGADOR DE INTERNET:
		iphone.exibirPagina(null);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		//INVOCANDO OS MÉTODOS DO APARELHO TELEFONICO
		iphone.ligar(null);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		//INVOCANDO OS MÉTODOS PARA REPRODUÇÃO DE MUSICAS:
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Eu e Deus no Sertão");

		
	}

}
