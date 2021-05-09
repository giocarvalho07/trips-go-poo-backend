package com.tripsGo.user;

import java.util.Date;

public class Usuario {
	
	private int id;
	private String nome;
	private String telefone;
	private Date data;
	
	
	public Usuario() {
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}


	public Usuario(int id, String nome, String telefone, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", data=" + data + "]";
	}

	
	
}
