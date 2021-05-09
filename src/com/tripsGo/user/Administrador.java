package com.tripsGo.user;

import java.util.Date;

public class Administrador extends Usuario{

	private String cnpj;
	
	public Administrador() {
		super();
	}

	public Administrador(int id, String nome, String telefone, Date data) {
		super(id, nome, telefone, data);
	}

	public Administrador(String cnpj) {
		super();
		this.cnpj = cnpj;
	}
	
	public Administrador(int id, String nome, String telefone, Date data, String cnpj) {
		super(id, nome, telefone, data );
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Administrador [cnpj=" + cnpj + "]";
	}
	
	
	
	
}
