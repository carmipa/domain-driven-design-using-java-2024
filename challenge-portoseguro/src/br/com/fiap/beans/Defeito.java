package br.com.fiap.beans;

public class Defeito {

	private int codigo;
	private String partesAfetadas;
	private String descricaoProblemas;
	private Cliente cliente;
	private Veiculo veiculo;
	private Agendamento agendamento;
	private Orcamento orcamento;

	public Defeito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Defeito(int codigo, String partesAfetadas, String descricaoProblemas) {
		super();
		this.codigo = codigo;
		this.partesAfetadas = partesAfetadas;
		this.descricaoProblemas = descricaoProblemas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPartesAfetadas() {
		return partesAfetadas;
	}

	public void setPartesAfetadas(String partesAfetadas) {
		this.partesAfetadas = partesAfetadas;
	}

	public String getDescricaoProblemas() {
		return descricaoProblemas;
	}

	public void setDescricaoProblemas(String descricaoProblemas) {
		this.descricaoProblemas = descricaoProblemas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}
