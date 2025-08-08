package view;

import java.util.Scanner;

import controller.OperationsController;

public class Main {

	public static void main(String[] args) {
		OperationsController op = new OperationsController();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o texto a ser dividido: ");
		String texto = in.next();
		in.close();
		
		op.dividirTexto(texto);
	}

}
