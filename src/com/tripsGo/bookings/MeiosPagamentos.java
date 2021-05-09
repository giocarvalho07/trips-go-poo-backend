package com.tripsGo.bookings;

public class MeiosPagamentos {

	private int id;
	private int tipoPagamento;
	private String nomePagamento;
	
	
	public MeiosPagamentos() {
		super();
	}

	public MeiosPagamentos(int id, int tipoPagamento, String nomePagamento) {
		super();
		this.id = id;
		this.tipoPagamento = tipoPagamento;
		this.nomePagamento = nomePagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNomePagamento() {
		return nomePagamento;
	}

	public void setNomePagamento(String nomePagamento) {
		this.nomePagamento = nomePagamento;
	}

	@Override
	public String toString() {
		return "MeiosPagamentos [id=" + id + ", tipoPagamento=" + tipoPagamento + ", nomePagamento=" + nomePagamento
				+ "]";
	}
	
	
	
	
}
