package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.beans.Calculo;

public class TesteCalculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculo calculo = new Calculo();
		/*
		 * calculo.setNumero1(10); calculo.setNumero2(20);
		 */
		
		
		System.out.println("Calculos:");
		System.out.println("Primeiro número...: ");
		calculo.setNumero1(scanner.nextInt());
		System.out.println("Segundo número....: ");
		calculo.setNumero2(scanner.nextInt());
		

		calculo.setSoma(calculo.getNumero1() + calculo.getNumero2());
		System.out.println("Soma...............: " + calculo.getSoma());
		
		calculo.setSubtracao(calculo.getNumero1() - calculo.getNumero2());
		System.out.println("Subtração..........: " + calculo.getSubtracao());
		
		calculo.setMultiplicacao(calculo.getNumero1() * calculo.getNumero2());
		System.out.println("Multiplicação......: " + calculo.getMultiplicacao());
		
		calculo.setDivisao(calculo.getNumero1() / calculo.getNumero2());
		System.out.println("Divisão............: " + calculo.getDivisao());
		
		calculo.setRestoDivisao(calculo.getNumero1() % calculo.getNumero2());
		System.out.println("Resto da divisão...: " + calculo.getRestoDivisao());
	}

}
