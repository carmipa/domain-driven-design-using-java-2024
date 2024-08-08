package br.com.fiap.main;

public class CalculoTeste {

	public static void main(String[] args) {

		int numero1 = 10;
		int numero2 = 2;
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		int divisao = 0;
		int restoDivisao = 0;

		soma = numero1 + numero2; // exemplo: getNumero1 / setNumero2 ou objeCalculo.setSoma = (objeCalculo.setNumero + objCalculo.setNumero2);
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		restoDivisao = numero1 % numero2;

		System.out.println("Soma: " + soma); // objeto.getSoma ou a saida System.out.println("Soma: " + objCalculo.getSoma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("divisão: " + divisao);
		System.out.println("Resto da divisão: " + restoDivisao);

	}

}
