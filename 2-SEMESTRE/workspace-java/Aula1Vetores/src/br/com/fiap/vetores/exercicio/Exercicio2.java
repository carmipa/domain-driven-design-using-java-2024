package br.com.fiap.vetores.exercicio;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * crie um programa que lei um vetor de 5 inteiros
		 * e imprima o vetor na ordem inversa
		 */
		
		int[] vetor = {0, 1, 2, 3, 4,};
		
		for(int i = vetor.length-1; i >= 0; i--) {
			
			System.out.println(vetor[i]);
			
			
		}
			

	}

}
