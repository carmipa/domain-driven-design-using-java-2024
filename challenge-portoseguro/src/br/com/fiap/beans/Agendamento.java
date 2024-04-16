package br.com.fiap.beans;

public class Agendamento {

	private int codigo;
	private int dia;
	private String mes;
	private String ano;
	private String periodoDia;
	private String horarioAtendimento;
	private Cliente cliente;
	private Defeito defeito;
	private Veiculo veiculo;
	private Agendamento agendamento;

	public Agendamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agendamento(int codigo, int dia, String mes, String ano, String periodoDia, String horarioAtendimento) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.periodoDia = periodoDia;
		this.horarioAtendimento = horarioAtendimento;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPeriodoDia() {
		return periodoDia;
	}

	public void setPeriodoDia(String periodoDia) {
		this.periodoDia = periodoDia;
	}

	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
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

}
