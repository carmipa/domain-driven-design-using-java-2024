package br.com.fiap.beans;

public class Veiculo {

	private int codigo;
	private String tipo;
	private String fabricante;
	private String modelo;
	private String motor;
	private String cor;
	private String anoFabricacao;
	private String placa;
	private String dono;
	private Cliente cliente;
	private Defeito defeito;
	private Cliente ciente;

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(int codigo, String tipo, String fabricante, String modelo, String motor, String cor,
			String anoFabricacao, String placa, String dono) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.motor = motor;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.dono = dono;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Defeito getDefeito() {
		return defeito;
	}

	public void setDefeito(Defeito defeito) {
		this.defeito = defeito;
	}

	public Cliente getCiente() {
		return ciente;
	}

	public void setCiente(Cliente ciente) {
		this.ciente = ciente;
	}

}
