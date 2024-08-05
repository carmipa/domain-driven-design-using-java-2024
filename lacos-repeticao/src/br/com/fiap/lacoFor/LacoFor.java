package br.com.fiap.lacoFor;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos: ");
		int quantidade = leitor.nextInt();
		
		double somaNotas = 0;
		
		for (int i = 0; i < quantidade; i++){
			System.out.println("Digite a nota do " + (i + 1) + "º aluno");
			float nota = leitor.nextFloat();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida");
				i--;
			}else {
				somaNotas += nota;
			}
		}
		
		double media = somaNotas / quantidade;
		
		System.out.println("A média da nota da turma é: " + quantidade);

	}

}
