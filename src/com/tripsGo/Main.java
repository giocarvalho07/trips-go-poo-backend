package com.tripsGo;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import com.tripsGo.bookings.ItemReserva;
import com.tripsGo.bookings.MeiosPagamentos;
import com.tripsGo.bookings.Reserva;
import com.tripsGo.bookings.ServicoHotel;
import com.tripsGo.user.Administrador;
import com.tripsGo.user.Cliente;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = data.format(myFormatObj);
		

		System.out.println("tripsGO");
		System.out.println(" -- Bem vindo -- ");
		
		
		System.out.println("  ");
		System.out.println(" -- Cadastro de usuários -- ");
		
		
		//administrador
		Administrador adm = new Administrador();
		System.out.println("  ");
		adm.setId(1);
		adm.setNome("AdmSteveHotels");
		adm.setTelefone("(55)11-914223658");
		adm.setCnpj("78.459.952.1000-09");
		
		System.out.println("Administrador");
		System.out.println("id: " + adm.getId());
		System.out.println("nome: " + adm.getNome());
		System.out.println("telefone: " + adm.getTelefone());
		System.out.println("data: " + formattedDate);
		System.out.println("cnpj: " + adm.getCnpj());
		
		// cliente
		
		Cliente cliente = new Cliente();
		cliente.setId(100);
		cliente.setNome("Bruno Silva");
		cliente.setTelefone("(55)11-74410052");
		cliente.setCpf("481.899.745.02");
		cliente.setLimiteHospedagem(true);
		
		System.out.println("  ");
		System.out.println("Cliente");
		System.out.println("id: " + cliente.getId());
		System.out.println("nome: " + cliente.getNome());
		System.out.println("telefone: " + cliente.getTelefone());
		System.out.println("cpf: " + cliente.getCpf());
		System.out.println("data: " + formattedDate);
		System.out.println("limite hospedagem: " + cliente.isLimiteHospedagem());
		
		
		// Serviço Hotel
		
		System.out.println("  ");
		System.out.println(" -- Cadastro de hotéis -- ");
		
		ServicoHotel servHotel = new ServicoHotel();
		
		servHotel.setId(2);
		servHotel.setNome("Steve Hotel´s");
		servHotel.setPrecoUnitario(45.59);
		servHotel.setQuantidadeDisposnivel(22);
		
		
		System.out.println("id: " + servHotel.getId());
		System.out.println("nome hotel: " + servHotel.getNome());
		System.out.println("preço unitário: R$ " + servHotel.getPrecoUnitario());
		System.out.println("quantidade disponível: " + servHotel.getQuantidadeDisposnivel());
		
		
		// Reserva Hotel
		
		System.out.println("  ");
		System.out.println(" -- Reserva de hotéis -- ");
		
		Reserva reserva = new Reserva();
		
		reserva.setId(1005);
		reserva.setStatus(true);
		reserva.setObservacao(" Quarto para familia com 4 pessoas + animal de estimação");
		reserva.setTaxa(29.99);
		
		
		System.out.println("id: " + reserva.getId());
		System.out.println("data: " + formattedDate);
		System.out.println("status: " + reserva.getStatus());
		System.out.println("observação: " + reserva.getObservacao());
		System.out.println("taxa: " + reserva.getTaxa());
		
		
		System.out.println("  ");
		System.out.println(" -- Check-in da Reserva de hotéis -- ");
		
		ItemReserva item = new ItemReserva();
		
		item.setId(25);
		item.setQuantidade(2);
		item.setPrecoFinal(servHotel.getPrecoUnitario() * item.getQuantidade() );
		
		System.out.println("id: " + item.getId());
		System.out.println("quantidade: " + item.getQuantidade());
		System.out.println("preço final: R$ " + item.getPrecoFinal());
		
		
		System.out.println("  ");
		System.out.println(" -- Meios de pagamento -- ");
		
		MeiosPagamentos pgmto = new MeiosPagamentos();
		
		pgmto.setId(159);
		pgmto.setTipoPagamento(2);
		pgmto.setNomePagamento("cartão de crédito");
		
		System.out.println("id: " + pgmto.getId());
		System.out.println("tipo de pagamento: " + pgmto.getTipoPagamento());
		System.out.println("nome do pagamento: " + pgmto.getNomePagamento());
		

		
		System.out.println("  ");
		System.out.println(" -- Qr Code -- ");

		 int[] qrCode = {22, 28, 82, 88};
		 
		 Random geradorQrCode = new Random();
		 

		 int qrCodeIndice = geradorQrCode.nextInt(qrCode.length);
		 int qrCodeX = qrCode[qrCodeIndice];
		 

		 int gerador = qrCodeX;
		 System.out.println("Qrcode: " + gerador);
		
	

	}

}
