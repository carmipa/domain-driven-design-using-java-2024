package br.com.fiap.beans;

public class Endereco {

	private int codigo;
	private String rua;
	private String numero;
	private String estado;
	private String complemento;

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(int codigo, String rua, String numero, String estado, String complemento) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
		this.complemento = complemento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
