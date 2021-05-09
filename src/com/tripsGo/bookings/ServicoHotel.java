package com.tripsGo.bookings;

public class ServicoHotel {
	
	private int id;
	private String nome;
	private double precoUnitario;
	private int quantidadeDisposnivel;
	
	public ServicoHotel() {
		super();
	}

	public ServicoHotel(int id, String nome, double precoUnitario, int quantidadeDisposnivel) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeDisposnivel = quantidadeDisposnivel;
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

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeDisposnivel() {
		return quantidadeDisposnivel;
	}

	public void setQuantidadeDisposnivel(int quantidadeDisposnivel) {
		this.quantidadeDisposnivel = quantidadeDisposnivel;
	}

	@Override
	public String toString() {
		return "ServicoHotel [id=" + id + ", nome=" + nome + ", precoUnitario=" + precoUnitario
				+ ", quantidadeDisposnivel=" + quantidadeDisposnivel + "]";
	}
	
	

}
