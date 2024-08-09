package br.com.fiap.fiap.vetores.exemplos;

import java.util.Arrays;
import java.util.Iterator;

public class OrdenacaoDeVetor {

	public static void main(String[] args) {

		// Ordenação de vetor
		int[] vetor5 = { 23, 2024, 54, 32 };

		
		Arrays.sort(vetor5);
		
		for (int i = 0; i < vetor5.length; i++){
			
			System.out.println("[" + i + "] = " + vetor5[i]);
		}

	}

}
