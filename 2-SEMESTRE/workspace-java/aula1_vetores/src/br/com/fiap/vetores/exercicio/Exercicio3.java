package br.com.fiap.vetores.exercicio;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/* 
		 * crie um programa que leia um vetor de 8 inteiros 
		 * e determina o maior e o menor valor presente no vetor.
		 * 
		 * */
		
		int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7};
        
        int maior = vetor[0];
        int menor = vetor[0];
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    

	}

}
