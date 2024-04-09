package br.com.fiap.main;

import br.com.fiap.BO.ColaboradorBO;
import br.com.fiap.BO.EmpresaBO;

public class Teste {

	public static void main(String[] args) {
		
		ColaboradorBO bo = new ColaboradorBO();
		
		bo.menuColaborador();
		bo.exibeColaborador();
		
		EmpresaBO eBo = new EmpresaBO();
		
		eBo.menuEmpresa();
		eBo.exibeEmpresa();
		
		

	}

}
