package com.local.bean;

public enum TipoProduto {
	
	HospedagemdeSites() {
		@Override
		public String descricao() {
			return "Hospedagem de Sites";
		}

	}, ServidorCloud {
		@Override
		public String descricao() {
			return "Servidor Cloud";
		}
		
	}, LojaVirtual {
		@Override
		public String descricao() {
			return "Loja Virtual";
		}
		
	};

	public abstract String descricao ();
}
