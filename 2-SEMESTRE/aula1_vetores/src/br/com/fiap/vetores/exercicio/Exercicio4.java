package br.com.fiap.vetores.exercicio;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Crie um programa que leia um vetor de 6 inteiros e calcule
		 * a média desses números.
		 * */		
		
		 int[] vetor = {0, 1, 2, 3, 4, 5};
	     int soma = 0;
	        
	     for (int i = 0; i < vetor.length; i++) {
	            soma += vetor[i];
	     }
	        
	     double media = (double) soma / vetor.length;
	        
	     System.out.println("A média dos números é: " + media);
	    
	 

	}

}
