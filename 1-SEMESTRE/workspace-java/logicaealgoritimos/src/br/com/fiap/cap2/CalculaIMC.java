package br.com.fiap.cap2;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner calcula = new Scanner(System.in);
		
		double altura = 0;
		double peso = 0;
		double imc = 0;
		
		System.out.println("Digite a altura do pasciente..........: ");
		altura = calcula.nextDouble();
		
		System.out.println("Digite o peso do pasciente............: ");
		peso = calcula.nextDouble();
		
		System.out.println("\n.......................................................\n");
		
		imc = (altura * altura) / peso;
		
		System.out.println("Altura.............: + M  " + altura);
		System.out.println("Peso...............: + Kg " + peso);
		System.out.println("IMC do pasciente...: + %  " + imc);
		System.out.println("\n.......................................................\n");
		
		

	}

}
