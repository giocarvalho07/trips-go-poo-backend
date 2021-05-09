package com.tripsGo.bookings;

public class ItemReserva {
	
	private int id;
	private int quantidade;
	private double precoFinal;
	
	
	public ItemReserva() {
		super();
	}

	public ItemReserva(int id, int quantidade, double precoFinal) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.precoFinal = precoFinal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	@Override
	public String toString() {
		return "ItemReserva [id=" + id + ", quantidade=" + quantidade + ", precoFinal=" + precoFinal + "]";
	}
	
	
	
}
