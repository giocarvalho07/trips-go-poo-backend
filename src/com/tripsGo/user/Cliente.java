package com.tripsGo.user;

import java.util.Date;

public class Cliente extends Usuario {

	private boolean limiteHospedagem;
	
	private String cpf;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String telefone, Date data) {
		super(id, nome, telefone, data);
	}
	
	public Cliente(boolean limiteHospedagem, String cpf) {
		super();
		this.limiteHospedagem = limiteHospedagem;
		this.cpf = cpf;
	}
	
	
	public Cliente(int id, String nome, String telefone, Date data, boolean limiteHospedagem, String cpf) {
		super(id, nome, telefone, data );
		this.limiteHospedagem = limiteHospedagem;
		this.cpf = cpf;
	}
	

	public boolean isLimiteHospedagem() {
		return limiteHospedagem;
	}

	public void setLimiteHospedagem(boolean limiteHospedagem) {
		this.limiteHospedagem = limiteHospedagem;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [limiteHospedagem=" + limiteHospedagem + ", cpf=" + cpf + "]";
	}
	
	
	
	
}
