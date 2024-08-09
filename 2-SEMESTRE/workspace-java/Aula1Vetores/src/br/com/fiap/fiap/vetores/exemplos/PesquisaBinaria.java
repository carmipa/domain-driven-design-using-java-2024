package br.com.fiap.fiap.vetores.exemplos;

import java.util.Arrays;

public class PesquisaBinaria {

	public static void main(String[] args) {
		

		// buscar número no vetor
		int[] vetor5 = { 23, 2024, 54, 32 };
		
		for(int num : vetor5) {
			if(num == 54) {
				// System.out.println("Tem o número 54");
			}
		}
		
		
		int i = Arrays.binarySearch(vetor5, 54);
		System.out.println(i);

	}

}
