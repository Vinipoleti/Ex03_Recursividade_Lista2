package view;

import Controller.QTPares;

public class Principal {

	public static void main(String[] args) {
		int vetor [] = {10,8,43,5,68,4};
		int tamanho = vetor.length;
		
		QTPares pares = new QTPares();
		
		System.out.println(pares.Pares(vetor, tamanho));
	}

}
