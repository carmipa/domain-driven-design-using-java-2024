package br.com.fiap.fiap.vetores.exemplos;

import java.util.Arrays;

public class ArrayInfinito {

	private int[] vetor = new int[0];

	public void adicionar(int valor) {

		int[] novoVetor = Arrays.copyOf(vetor, vetor.length + 1);
		novoVetor[vetor.length - 1] = valor;

		vetor = novoVetor;

	}

	public void adicionarExemplo2(int valor) {

		vetor = Arrays.copyOf(vetor, vetor.length + 1);
		vetor[vetor.length - 1] = valor;

	}
	
	public void print() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] = " + vetor[i]);
		}
	}

}
