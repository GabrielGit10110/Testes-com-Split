package controller;

public class OperationsController {
	public OperationsController() {
		super();
	}
	
	public void dividirTexto(String texto) {
		String[] palavraSeparada = texto.split(";");
		
		int tamanho = palavraSeparada.length;

		System.out.printf("O texto tem %d palavras...", tamanho);
	}

}
