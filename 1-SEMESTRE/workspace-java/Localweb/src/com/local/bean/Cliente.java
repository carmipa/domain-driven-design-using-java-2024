package com.local.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	public Cliente() {
		
	}
	
	private String nome;
	private String email;
	private String telefone;
	private Calendar data;
	private String cpfCnpj;
	private List<Pedido> pedidos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public void imprimeDetalhes(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", telefone="
				+ telefone + ", cpfCnpj=" + cpfCnpj + "]";
	}

}
