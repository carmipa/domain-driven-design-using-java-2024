package br.com.fiap.bean;

public class Debito extends Cartao {

	private double consignado;

	// metodo construtor vazio

	public Debito() {
		super();
		// TODO Auto-generated constructor stub
	}

	// metodo construtor cheio com herça

	public Debito(String banco, String bandeira, String validade, int cvv, int numero, double saldo, double compra,
			double consignado) {
		super(banco, bandeira, validade, cvv, numero, saldo, compra);
		this.consignado = consignado;
	}

	public double getConsignado() {
		return consignado;
	}

	public void setConsignado(double consignado) {
		this.consignado = consignado;
	}

	@Override
	public double limite() {

		return saldo - consignado;
	}

	@Override
	public String status() {
		
		String aviso = null;
		if (compra > limite()) {
			aviso = "LÍMITE EXCEDIDO";
		}else {
			aviso = "COMPRA APROVADA";
		}
		
		return aviso;
	}

}
