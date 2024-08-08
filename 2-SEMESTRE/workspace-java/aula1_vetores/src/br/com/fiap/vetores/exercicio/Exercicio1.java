package br.com.fiap.vetores.exercicio;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/* Crie um programa que leia um vetor de 10 inteiros e 
		 * conte quantos desses números são pares e quantos são impares;*/
		
		int[] vetor = new int[10];
		
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;
		vetor[5] = 6;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 9;
		vetor[9] = 10;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] % 2 == 0) {
				
				System.out.println("Os valores do vetor são pares: " + vetor[i]);
				
			}else {
				System.out.println("Os valore do vetor são inpares: " + vetor[i]);
			}
			
		}

	}

}
