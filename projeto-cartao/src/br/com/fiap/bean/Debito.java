package br.com.fiap.bean;

public class Debito extends Cartao {

	private double consignado;

	public Debito() {
		super();
		// TODO Auto-generated constructor stub
	}

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

}
