package br.com.fiap.cap2;

import java.util.Scanner;

public class CalculaAreaDoTriangulo {

	public static void main(String[] args) {
		
		// int area = 0;
		// int base = 8;
		// int altura = 8;
		
		double area = 0;
		double base = 0;
		double altura = 0;
		
		
		
		// area = (base * altura) / 2;
		// System.out.println("Calculo da area do triângulo é de: " + area);
		
		Scanner calcular = new Scanner(System.in);
		
		System.out.println("Digite a altura do triângulo.............: ");
		altura = calcular.nextDouble();
		
		System.out.println("digite o tamanho da base do triângulo....: ");
		base = calcular.nextDouble();
		System.out.println("\n.......................................................\n");
		
		area = (base * altura) / 2;
		
		System.out.println("Area.........................: " + altura);
		System.out.println("Base.........................: " + base);
		System.out.println("A area do triângulo é de.....: " + area);
		System.out.println("\n.......................................................\n");
		
					
	}

}
