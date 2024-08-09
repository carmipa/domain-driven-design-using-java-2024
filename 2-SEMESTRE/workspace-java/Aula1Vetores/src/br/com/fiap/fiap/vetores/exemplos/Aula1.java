package br.com.fiap.fiap.vetores.exemplos;

import java.util.Arrays;

public class Aula1 {

	public static void main(String[] args) {
		// criação por conta do nome do vetor
		int[] vetor1 = new int[10];

		vetor1[0] = 12;
		vetor1[1] = 23;
		vetor1[2] = 22;

		// criação de um vetor pelo indices dele
		int[] vetor2 = { 23, 2024, 54, 32 };

		System.out.println(vetor2.length);

		for (int i = 0; i < vetor2.length; i++) {

			System.out.println(vetor2[i]);

			// imprime o tamanho do vetor
			// System.out.println(i);
		}

		for (int num : vetor2) {
			System.out.println(num);
		}

		int i = 0;
		while (i != vetor2.length) {
			System.out.println(vetor2[i]);
			i++;
		}

		int[] vetor3 = vetor2;

		System.out.println("vetor2[2]" + " " + vetor2[2]);
		
		// copiando vetor

		int[] vetor4 = Arrays.copyOf(vetor2, vetor2.length);
		System.out.println("vetor2[3]" + " " + vetor2[3]);
		
		//vetor infinito
		ArrayInfinito vetorInfinito = new ArrayInfinito();
		
		vetorInfinito.adicionar(10);
		vetorInfinito.adicionar(20);
		vetorInfinito.adicionar(30);
		vetorInfinito.adicionar(40);
		
		vetorInfinito.print();
		
		vetorInfinito.adicionar(50);
		
		vetorInfinito.print();
		
		
		// buscar número no vetor
		int[] vetor5 = { 23, 2024, 54, 32 };
		
		for(int num : vetor5) {
			if(num == 54) {
				System.out.println("Tem o número 54");
			}
		}
		
		// busca no array
		
		
		
		

	}

}
