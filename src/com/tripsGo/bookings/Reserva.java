package com.tripsGo.bookings;

import java.util.Date;

public class Reserva {
	
	private int id;
	private Date dataReserva;
	private boolean status;
	private String observacao;
	private double taxa;
	
	
	public Reserva() {
		super();
	}

	public Reserva(int id, Date dataReserva, boolean status, String observacao, double taxa) {
		super();
		this.id = id;
		this.dataReserva = dataReserva;
		this.status = status;
		this.observacao = observacao;
		this.taxa = taxa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", dataReserva=" + dataReserva + ", status=" + status + ", observacao="
				+ observacao + ", taxa=" + taxa + "]";
	}
	
	
	

}
