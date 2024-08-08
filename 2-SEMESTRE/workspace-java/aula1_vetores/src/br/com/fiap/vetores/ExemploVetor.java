package br.com.fiap.vetores;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// criação por conta do nome do vetor
		int[] vetor1 = new int[10];
		
		vetor1[0] = 12;
		vetor1[1] = 23;
		vetor1[2] = 30;
		
		// criação de um vetor pelo indices dele
		int[] vetor2 = {23, 2024, 54, 32};
				
		System.out.println(vetor2.length);
		
		for (int i=0; i < vetor2.length; i++) {
			
			System.out.println(vetor2[i]);
						
			// imprime o tamanho do vetor
			// System.out.println(i);
		}
		
		for(int num : vetor2) {
			System.out.println(num);
		}
		
		int i = 0;
		while(i != vetor2.length){
			System.out.println(vetor2[i]);
			i++;
		}

	}

}
